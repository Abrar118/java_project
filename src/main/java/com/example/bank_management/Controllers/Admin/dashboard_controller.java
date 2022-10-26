package com.example.bank_management.Controllers.Admin;

import com.example.bank_management.Model.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class dashboard_controller implements Initializable
{
    public Label date;
    public Label name;
    public Button create_account_button;
    public Button profile_button;
    public Button activity_button;
    public Button clientele_button;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        add_listeners();
    }

    private void add_listeners()
    {
        create_account_button.setOnMouseClicked(MouseEvent -> create_account());
        profile_button.setOnMouseClicked(MouseEvent -> profile());
        activity_button.setOnMouseClicked(MouseEvent -> activity());
        clientele_button.setOnMouseClicked(MouseEvent -> clientele());
    }

    private void profile() { Model.get_model().get_view_manager().get_admin_option_clicked().set("profile"); }

    private void clientele() { Model.get_model().get_view_manager().get_admin_option_clicked().set("clientele"); }

    private void activity()
    {
        Model.get_model().get_view_manager().get_admin_option_clicked().set("activity");
    }

    private void create_account()
    {
        Model.get_model().get_view_manager().get_admin_option_clicked().set("account");
    }
}
