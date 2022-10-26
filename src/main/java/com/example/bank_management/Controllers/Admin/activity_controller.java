package com.example.bank_management.Controllers.Admin;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class activity_controller implements Initializable
{

    public Label pending_activity;
    public Button schedule_button;
    public ListView activity_list;
    public AnchorPane new_activity_pane;
    public DatePicker due_date;
    public TextField new_activity_name;
    public FontAwesomeIconView confirm_schedule;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        schedule_button.setOnMouseClicked(MouseEvent -> appear_activity_scheduler());
        confirm_schedule.setOnMouseClicked(MouseEvent -> disappear_activity_scheduler());
    }


    private void appear_activity_scheduler()
    {
        TranslateTransition transition = new TranslateTransition(Duration.millis(200), schedule_button);
        transition.setToX(-360);
        transition.play();


        ScaleTransition scaleTransition =  new ScaleTransition(Duration.millis(500), new_activity_pane);
        scaleTransition.setToX(1);
        scaleTransition.setToY(1);

        FadeTransition fadeTransition =  new FadeTransition(Duration.millis(500), new_activity_pane);
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(1);

        ParallelTransition parallelTransition = new ParallelTransition();
        parallelTransition.getChildren().addAll(scaleTransition, fadeTransition);
        parallelTransition.play();
    }

    private void disappear_activity_scheduler()
    {
        TranslateTransition transition = new TranslateTransition(Duration.millis(500), schedule_button);
        transition.setToX(0);
        transition.play();


        ScaleTransition scaleTransition =  new ScaleTransition(Duration.millis(200), new_activity_pane);
        scaleTransition.setToX(0);
        scaleTransition.setToY(0);

        FadeTransition fadeTransition =  new FadeTransition(Duration.millis(200), new_activity_pane);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);

        ParallelTransition parallelTransition = new ParallelTransition();
        parallelTransition.getChildren().addAll(scaleTransition, fadeTransition);
        parallelTransition.play();
    }
}
