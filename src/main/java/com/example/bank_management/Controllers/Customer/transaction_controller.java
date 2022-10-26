package com.example.bank_management.Controllers.Customer;

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

public class transaction_controller implements Initializable
{

    public ListView transaction_list;
    public TextField receiver;
    public TextField send_amount;
    public TextArea message;
    public FontAwesomeIconView send_button;
    public Button new_button;
    public AnchorPane new_transaction_pane;
    public Label total_transaction_amount;
    public Label total_transaction_count;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        new_button.setOnMouseClicked(MouseEvent -> new_transaction_appear());
        send_button.setOnMouseClicked(MouseEvent -> disappear_activity_scheduler());
    }










    private void new_transaction_appear()
    {
        TranslateTransition transition =  new TranslateTransition(Duration.millis(200), new_button);
        transition.setToY(-300);
        transition.play();

        ScaleTransition scaleTransition =  new ScaleTransition(Duration.millis(500), new_transaction_pane);
        scaleTransition.setToX(1);
        scaleTransition.setToY(1);

        FadeTransition fadeTransition =  new FadeTransition(Duration.millis(500), new_transaction_pane);
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(1);

        ParallelTransition parallelTransition = new ParallelTransition();
        parallelTransition.getChildren().addAll(scaleTransition, fadeTransition);
        parallelTransition.play();
    }

    private void disappear_activity_scheduler()
    {
        TranslateTransition transition = new TranslateTransition(Duration.millis(500), new_button);
        transition.setToY(0);
        transition.play();


        ScaleTransition scaleTransition =  new ScaleTransition(Duration.millis(200), new_transaction_pane);
        scaleTransition.setToX(0);
        scaleTransition.setToY(0);

        FadeTransition fadeTransition =  new FadeTransition(Duration.millis(200), new_transaction_pane);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);

        ParallelTransition parallelTransition = new ParallelTransition();
        parallelTransition.getChildren().addAll(scaleTransition, fadeTransition);
        parallelTransition.play();
    }
}
