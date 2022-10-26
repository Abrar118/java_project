package com.example.bank_management.Controllers.Customer;

import javafx.animation.*;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class dashboard_controller implements Initializable
{
    public Label profile_name;
    public Label date;
    public Label checking_account_balance;
    public Label checking_number;
    public Label savings_account_balance;
    public Label savings_number;
    public Label fixed_deposit_balance;
    public Label fixed_deposit_number;
    public ListView activity_list;
    public Label income;
    public Label expense;
    public AnchorPane fixed_account;
    public AnchorPane savings_account;
    public AnchorPane checking_account;
    public Circle circle2;
    public Circle circle1;
    public AnchorPane accounts_holder;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        set_rotate(circle1,10000, 360);
        set_rotate(circle2, 5000, -360);
        appear();
    }

    private void set_rotate(Circle c, int time, int angle)
    {
        RotateTransition rotate= new RotateTransition(Duration.millis(time), c);
        rotate.setByAngle(angle);
        rotate.setCycleCount(Timeline.INDEFINITE);
        rotate.setAutoReverse(true);


        ScaleTransition scaleTransition =  new ScaleTransition(Duration.millis(1000), c);
        scaleTransition.setToY(0.5);
        scaleTransition.setToX(0.5);
        scaleTransition.setCycleCount(Timeline.INDEFINITE);
        scaleTransition.setAutoReverse(true);

        ParallelTransition parallelTransition = new ParallelTransition();
        parallelTransition.getChildren().addAll(rotate, scaleTransition);
        parallelTransition.play();
    }

    private void appear()
    {
        FadeTransition fadeTransition= new FadeTransition(Duration.millis(3000), accounts_holder);
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(1);
        fadeTransition.play();
    }

}
