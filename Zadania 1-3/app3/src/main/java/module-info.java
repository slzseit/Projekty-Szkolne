module com.example.app3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.app3 to javafx.fxml;
    exports com.example.app3;
}