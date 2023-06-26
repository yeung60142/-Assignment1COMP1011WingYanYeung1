package com.example.assignment1comp1011wingyanyeung1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class DBUnility {
    private static String m_user = "student";
    private static String m_password = "student";
    private static String DATABASE_URL = "jdbc:mysql://localhost:3306/infrastructure";

    public static void fetchDataFromSQL(TableView<ObservableList<String>> tableView) {
        try (Connection connection = DriverManager.getConnection(DATABASE_URL, m_user, m_password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT id, project_name, supporting_ministry, region, status, target_complete, estimated_budget FROM ontbuilds")) {

            // Clear existing data in the TableView
            tableView.getItems().clear();
            tableView.getColumns().clear();

            // Create columns dynamically
            int columnCount = resultSet.getMetaData().getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                final int columnIndex = i; // Create a final variable
                TableColumn<ObservableList<String>, String> column = new TableColumn<>(resultSet.getMetaData().getColumnName(i));
                column.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().get(columnIndex - 1)));
                tableView.getColumns().add(column);
            }

            // Populate data
            while (resultSet.next()) {
                ObservableList<String> rowData = FXCollections.observableArrayList();
                for (int i = 1; i <= columnCount; i++) {
                    rowData.add(resultSet.getString(i));
                }
                tableView.getItems().add(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }





}
