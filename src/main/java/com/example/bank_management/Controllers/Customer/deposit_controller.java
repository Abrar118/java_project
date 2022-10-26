package com.example.bank_management.Controllers.Customer;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class deposit_controller implements Initializable
{
    public Label total_deposit;
    public Label total_withdraw;
    public Button new_deposit;
    public Button new_withdrawal;
    public FontAwesomeIconView send_withdraw;
    public FontAwesomeIconView send_deposit;
    public TextField deposit_amount;
    public TextField withdraw_amount;
    public AnchorPane new_deposit_pane;
    public AnchorPane new_withdraw_pane;
    public ListView deposit_list;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        new_deposit.setOnMouseClicked(this::new_deposit_withdraw_appear);
        new_withdrawal.setOnMouseClicked(this::new_deposit_withdraw_appear);
        send_deposit.setOnMouseClicked(this::disappear_deposit_withdraw);
        send_withdraw.setOnMouseClicked(this::disappear_deposit_withdraw);
    }






    private void new_deposit_withdraw_appear(MouseEvent mouseEvent)
    {
        if(mouseEvent.getSource().equals(new_deposit))
        {
            TranslateTransition transition =  new TranslateTransition(Duration.millis(200), new_deposit);
            transition.setToY(-300);
            transition.play();

            TranslateTransition transition1 =  new TranslateTransition(Duration.millis(200), new_withdrawal);
            transition1.setToY(-300);
            transition1.play();

            ScaleTransition scaleTransition =  new ScaleTransition(Duration.millis(500), new_deposit_pane);
            scaleTransition.setToX(1);
            scaleTransition.setToY(1);

            FadeTransition fadeTransition =  new FadeTransition(Duration.millis(500), new_deposit_pane);
            fadeTransition.setFromValue(0);
            fadeTransition.setToValue(1);

            ParallelTransition parallelTransition = new ParallelTransition();
            parallelTransition.getChildren().addAll(scaleTransition, fadeTransition);
            parallelTransition.play();
        }
        else if(mouseEvent.getSource().equals(new_withdrawal))
        {
            TranslateTransition transition =  new TranslateTransition(Duration.millis(200), new_deposit);
            transition.setToY(-300);
            transition.play();

            TranslateTransition transition1 =  new TranslateTransition(Duration.millis(200), new_withdrawal);
            transition1.setToY(-300);
            transition1.play();

            ScaleTransition scaleTransition =  new ScaleTransition(Duration.millis(500), new_withdraw_pane);
            scaleTransition.setToX(1);
            scaleTransition.setToY(1);

            FadeTransition fadeTransition =  new FadeTransition(Duration.millis(500), new_withdraw_pane);
            fadeTransition.setFromValue(0);
            fadeTransition.setToValue(1);

            ParallelTransition parallelTransition = new ParallelTransition();
            parallelTransition.getChildren().addAll(scaleTransition, fadeTransition);
            parallelTransition.play();
        }
    }

    private void disappear_deposit_withdraw(MouseEvent mouseEvent)
    {
        if(mouseEvent.getSource().equals(send_deposit))
        {
            TranslateTransition transition =  new TranslateTransition(Duration.millis(500), new_deposit);
            transition.setToY(0);
            transition.play();

            TranslateTransition transition1 =  new TranslateTransition(Duration.millis(500), new_withdrawal);
            transition1.setToY(0);
            transition1.play();

            ScaleTransition scaleTransition =  new ScaleTransition(Duration.millis(200), new_deposit_pane);
            scaleTransition.setToX(0);
            scaleTransition.setToY(0);

            FadeTransition fadeTransition =  new FadeTransition(Duration.millis(200), new_deposit_pane);
            fadeTransition.setFromValue(1);
            fadeTransition.setToValue(0);

            ParallelTransition parallelTransition = new ParallelTransition();
            parallelTransition.getChildren().addAll(scaleTransition, fadeTransition);
            parallelTransition.play();
        }
        else if(mouseEvent.getSource().equals(send_withdraw))
        {
            TranslateTransition transition =  new TranslateTransition(Duration.millis(500), new_deposit);
            transition.setToY(0);
            transition.play();

            TranslateTransition transition1 =  new TranslateTransition(Duration.millis(500), new_withdrawal);
            transition1.setToY(0);
            transition1.play();

            ScaleTransition scaleTransition =  new ScaleTransition(Duration.millis(200), new_withdraw_pane);
            scaleTransition.setToX(0);
            scaleTransition.setToY(0);

            FadeTransition fadeTransition =  new FadeTransition(Duration.millis(200), new_withdraw_pane);
            fadeTransition.setFromValue(1);
            fadeTransition.setToValue(0);

            ParallelTransition parallelTransition = new ParallelTransition();
            parallelTransition.getChildren().addAll(scaleTransition, fadeTransition);
            parallelTransition.play();
        }
    }
}
