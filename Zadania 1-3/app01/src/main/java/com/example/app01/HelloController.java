package com.example.app01;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.io.FileInputStream;

public class HelloController {
    @FXML
    private Label welcomeText;


    @FXML
    private void changePhoto(){
        ImageView img1;
        img1 = new ImageView(Image.getResourceAsStream("C:\\Users\\user\\Desktop\\x.jpg"));
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}