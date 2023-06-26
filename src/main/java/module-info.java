module com.example.assignment1comp1011wingyanyeung1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires org.controlsfx.controls;

    opens com.example.assignment1comp1011wingyanyeung1 to javafx.fxml;
    exports com.example.assignment1comp1011wingyanyeung1;
}