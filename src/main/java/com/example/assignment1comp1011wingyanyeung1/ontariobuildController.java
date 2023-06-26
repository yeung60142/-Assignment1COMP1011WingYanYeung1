package com.example.assignment1comp1011wingyanyeung1;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;
import java.io.IOException;

public class ontariobuildController {
    @FXML
    private TableView<ObservableList<String>> T1;

    @FXML
    private Button button_id;

    @FXML
    private TableColumn<ObservableList<String>, String> c1;

    @FXML
    private TableColumn<ObservableList<String>, String> c2;

    @FXML
    private TableColumn<ObservableList<String>, String> c3;

    @FXML
    private TableColumn<ObservableList<String>, String> c4;

    @FXML
    private TableColumn<ObservableList<String>, String> c5;

    @FXML
    private TableColumn<ObservableList<String>, String> c6;

    @FXML
    private TableColumn<ObservableList<String>, String> c7;

    @FXML
    private void initialize() {
        setupTableColumns();
        fetchDataFromSQL();
    }

    //change the view
    @FXML
    private void handleButtonAction() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("bar_chart.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) button_id.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Bar Chart View");

            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setupTableColumns() {
        T1.getColumns().clear();
        T1.getColumns().addAll(c1, c2, c3, c4, c5, c6, c7);
    }

    private void fetchDataFromSQL() {
        DBUnility.fetchDataFromSQL(T1);
    }
}