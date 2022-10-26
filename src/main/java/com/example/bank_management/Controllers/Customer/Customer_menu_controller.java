package com.example.bank_management.Controllers.Customer;

import com.example.bank_management.Model.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Customer_menu_controller implements Initializable
{
    public Button dashboard_button;
    public Button profile_button;
    public Button transaction_button;
    public Button deposit_button;
    public Button about_button;
    public Button log_out_button;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        add_listeners();
    }

    private void add_listeners()
    {
        dashboard_button.setOnMouseClicked(MouseEvent -> dashboard_click());
        transaction_button.setOnMouseClicked(MouseEvent -> transaction_clicked());
        deposit_button.setOnMouseClicked(MouseEvent -> deposit_clicked());
        profile_button.setOnMouseClicked(MouseEvent -> profile_button_clicked());

        about_button.setOnMouseClicked(MouseEvent -> about_button_clicked());

        log_out_button.setOnMouseClicked(MouseEvent -> {
            try {log_out();}
            catch (IOException e) {throw new RuntimeException(e);}});
    }

    private void profile_button_clicked()
    {
        Model.get_model().get_view_manager().get_customer_option_clicked().set("profile");
    }

    private void about_button_clicked()
    {
        Model.get_model().get_view_manager().get_customer_option_clicked().set("about");
    }

    private void deposit_clicked()
    {
        Model.get_model().get_view_manager().get_customer_option_clicked().set("deposit");
    }

    private void transaction_clicked()
    {
        Model.get_model().get_view_manager().get_customer_option_clicked().set("transaction");
    }

    private void dashboard_click()
    {
        Model.get_model().get_view_manager().get_customer_option_clicked().set("dashboard");
    }

    private void log_out() throws IOException
    {
        Model.get_model().get_view_manager().close_stage((Stage) log_out_button.getScene().getWindow());
        Model.get_model().get_view_manager().show_log_in_window();

        Model.get_model().get_view_manager().get_customer_option_clicked().set("");
    }
}
