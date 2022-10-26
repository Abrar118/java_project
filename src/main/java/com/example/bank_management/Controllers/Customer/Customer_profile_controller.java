package com.example.bank_management.Controllers.Customer;

import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Customer_profile_controller implements Initializable
{
    public HBox account_pane;
    public Text messages;
    public Text contacts;
    public Label checking_balance;
    public Label savings_balance;
    public Label fixed_balance;
    boolean account_click=true;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {

    }

    public void account_click()
    {
        FadeTransition account_transition= new FadeTransition(Duration.millis(300),account_pane);
        ScaleTransition scale= new ScaleTransition(Duration.millis(300), account_pane);

        if(account_click)
        {
            account_transition.setFromValue(1);
            account_transition.setToValue(0);

            scale.setToY(0);
            scale.setToX(0);

            account_click=false;
        }
        else
        {
            account_transition.setFromValue(0);
            account_transition.setToValue(1);

            scale.setToY(1);
            scale.setToX(1);

            account_click=true;
        }

        ParallelTransition group= new ParallelTransition();
        group.getChildren().addAll(account_transition, scale);
        group.setCycleCount(1);
        group.play();
    }
}
