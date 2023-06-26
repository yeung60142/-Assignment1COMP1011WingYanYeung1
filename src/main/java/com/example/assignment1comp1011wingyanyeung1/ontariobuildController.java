package com.example.assignment1comp1011wingyanyeung1;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;


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
        private void handleButtonAction() {
                T1.getColumns().clear();
                T1.getColumns().addAll(c1, c2, c3, c4, c5, c6, c7);

                DBUnility.fetchDataFromSQL(T1);
        }
}
