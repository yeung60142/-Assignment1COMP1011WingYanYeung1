package com.example.assignment1comp1011wingyanyeung1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;

public class bar_chartController {
    @FXML
    private BarChart<String, Number> bar_char1;

    @FXML
    private RadioButton rStatus;

    @FXML
    private RadioButton rRegion;

    @FXML
    private RadioButton rTarget_complete;

    @FXML
    private Button bViewTable;

    private final ToggleGroup toggleGroup = new ToggleGroup();

    @FXML
    private void initialize() {
        // Add the radio buttons to the toggle group
        rStatus.setToggleGroup(toggleGroup);
        rRegion.setToggleGroup(toggleGroup);
        rTarget_complete.setToggleGroup(toggleGroup);

        // Select the first radio button by default
        toggleGroup.selectToggle(rStatus);

        // Set the event handler for the View Table button
        bViewTable.setOnAction(event -> {
            // Change the view to ontariobuild.fxml
            // Add your code here to switch the view
        });
    }

    //change scene
    @FXML
    private void button_view_table() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ontariobuild.fxml"));
            Parent root = loader.load();
            ontariobuildController controller = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = (Stage) bViewTable.getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateBarChart(ObservableList<ontariobuild> data) {
        // Clear existing data in the bar chart
        bar_char1.getData().clear();

        // Create the series
        BarChart.Series<String, Number> series = new BarChart.Series<>();
        series.setName("Estimated Budget ($M)");

        // Add data to the series
        for (ontariobuild build : data) {
            series.getData().add(new BarChart.Data<>(build.getProject_name(), build.getEstimated_budget()));
        }
        bar_char1.getData().add(series);
    }
}
