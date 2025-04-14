package com.example.app02;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public TextField textInp01;
    @FXML
    public Label label01;

    @FXML
    public void buttonClicked() {
        String gettedInput = textInp01.getText();
        label01.setText(gettedInput);
    }
}