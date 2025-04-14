module com.example.app02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.app02 to javafx.fxml;
    exports com.example.app02;
}