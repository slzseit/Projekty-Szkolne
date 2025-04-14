package com.example.app3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class HelloController {
    @FXML
    public RadioButton radioBut02;
    @FXML
    public RadioButton radioBut01;
    @FXML
    public Label label01;

    public void checkState(ActionEvent actionEvent) {
        if(radioBut01.isSelected()){
            label01.setText("Pies");
        }
        if(radioBut02.isSelected()){
            label01.setText("Kot");
        }
    }
}