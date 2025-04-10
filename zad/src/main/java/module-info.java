module com.skibidi.www.zad {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.skibidi.www.zad to javafx.fxml;
    exports com.skibidi.www.zad;
}