package com.example.bank_management.Controllers.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class admin_profile_controller implements Initializable
{
    public Text notification;
    public Text contacts;
    public Label name;
    public Label admin_type;
    public Circle profile_picture;
    public Label client_count;
    public Label rating;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        profile_picture.setFill(new ImagePattern(new Image("G:\\Java Khet projects\\Bank_management\\src\\main\\resources\\Images\\images.jpg")));
    }
}
