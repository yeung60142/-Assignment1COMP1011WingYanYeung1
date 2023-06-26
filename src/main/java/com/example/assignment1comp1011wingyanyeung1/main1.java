package com.example.assignment1comp1011wingyanyeung1;

import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.application.Platform;

public class main1 {

    public static void main(String[] args) {
        // Initialize JavaFX toolkit
        Platform.startup(() -> {});

        TableView<ObservableList<String>> tableView = new TableView<>();

        // Fetch data from SQL and populate the TableView
        DBUnility.fetchDataFromSQL(tableView);

        // Print the results
        for (ObservableList<String> rowData : tableView.getItems()) {
            System.out.println(rowData);
        }
    }
}