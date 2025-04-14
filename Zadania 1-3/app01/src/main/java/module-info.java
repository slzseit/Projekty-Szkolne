module com.example.app01 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.app01 to javafx.fxml;
    exports com.example.app01;
}