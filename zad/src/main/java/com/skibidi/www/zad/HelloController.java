package com.skibidi.www.zad;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    public TextField miasto;
    public TextField imie;
    public TextField telefon;
    public TextField email;
    public TextField nazwisko;
    public ImageView imageView;
    public CheckBox budowlaniec;
    public CheckBox piosenkarz;
    public CheckBox wiolonczelistka;
    public CheckBox hostessa;
    public CheckBox poeta;
    public CheckBox architekt;
    public String zawod = "";
    public int counter = 0;

    @FXML
    void SkibidiClick()
    {
        Image image1 = new Image(getClass().getResourceAsStream("/assets/architekt.jpg"));
        Image image2 = new Image(getClass().getResourceAsStream("/assets/budowlaniec.jpg"));
        Image image3 = new Image(getClass().getResourceAsStream("/assets/hostessa.jpeg"));
        Image image4 = new Image(getClass().getResourceAsStream("/assets/piosenkarz.jpg"));
        Image image5 = new Image(getClass().getResourceAsStream("/assets/poeta.png"));
        Image image6 = new Image(getClass().getResourceAsStream("/assets/wiolonczelistka.jpg"));

        if(budowlaniec.isSelected())
        {
            imageView.setImage(image2);
            zawod = "budowlaniec";
        }
        else if(architekt.isSelected())
        {
            imageView.setImage(image1);
            zawod = "architekt";
        }
        else if(hostessa.isSelected())
        {
            imageView.setImage(image3);
            zawod = "hostessa";
        }
        else if(piosenkarz.isSelected())
        {
            imageView.setImage(image4);
            zawod = "piosenkarz";
        }
        else if(poeta.isSelected())
        {
            imageView.setImage(image5);
            zawod = "poeta";
        }
        else if(wiolonczelistka.isSelected())
        {
            imageView.setImage(image6);
            zawod = "wiolonczelistka";
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.getDialogPane().setContentText("Czesc jestem " + imie.getText() + " " + nazwisko.getText() + " pracuje jako " + zawod + " i mieszkam w " + miasto.getText());
        alert.showAndWait();



    }
}