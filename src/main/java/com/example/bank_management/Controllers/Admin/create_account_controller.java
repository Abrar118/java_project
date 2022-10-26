package com.example.bank_management.Controllers.Admin;

import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class create_account_controller implements Initializable
{
    public TextField last_name;
    public TextField first_name;
    public TextField email;
    public PasswordField password;
    public CheckBox policy_check_box;
    public Button create_account_button;
    public AnchorPane successful_message;
    public Label warning_message;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        create_account_button.setOnMouseClicked(MouseEvent -> {
            try{show_successful();}
            catch (InterruptedException e){throw new RuntimeException(e);}});
    }








    private void show_successful() throws InterruptedException
    {
        if(first_name.getText().isEmpty() || last_name.getText().isEmpty() || email.getText().isEmpty() || password.getText().isEmpty())
        {
            warning_message.setText("Please fill out all of the information.");

            FadeTransition fadeTransition = new FadeTransition(Duration.millis(3000), warning_message);
            fadeTransition.setFromValue(1);
            fadeTransition.setToValue(0);
            fadeTransition.play();
        }
        else if(!policy_check_box.isSelected())
        {
            warning_message.setText("Please agree to our terms and of usage and privacy policy.");

            FadeTransition fadeTransition = new FadeTransition(Duration.millis(3000), warning_message);
            fadeTransition.setFromValue(1);
            fadeTransition.setToValue(0);
            fadeTransition.play();
        }
        else if(policy_check_box.isSelected())
        {
            ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(1000), successful_message);
            scaleTransition.setToX(1);
            scaleTransition.setToY(1);

            FadeTransition fadeTransition = new FadeTransition(Duration.millis(100), successful_message);
            fadeTransition.setFromValue(0);
            fadeTransition.setToValue(1);

            ParallelTransition parallelTransition = new ParallelTransition();
            parallelTransition.getChildren().addAll(scaleTransition, fadeTransition);
            parallelTransition.play();
        }
    }
}
