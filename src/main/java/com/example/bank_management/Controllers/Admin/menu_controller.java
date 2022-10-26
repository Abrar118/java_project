package com.example.bank_management.Controllers.Admin;

import com.example.bank_management.Model.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class menu_controller implements Initializable
{
    public Button create_account_button;
    public Button profile_button;
    public Button activity_button;
    public Button clientele_button;
    public Button log_out_button;
    public Button about_us_button;

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

        log_out_button.setOnMouseClicked(MouseEvent -> {
            try {log_out();}
            catch (IOException e) {throw new RuntimeException(e);}});

        about_us_button.setOnMouseClicked(MouseEvent -> {
            try {about_us();}
            catch (IOException e){throw new RuntimeException(e);}});
    }

    private void about_us() throws IOException
    {
        Model.get_model().get_view_manager().show_about_window();
    }

    private void log_out() throws IOException
    {
        Model.get_model().get_view_manager().close_stage((Stage) log_out_button.getScene().getWindow());
        Model.get_model().get_view_manager().show_log_in_window();

        Model.get_model().get_view_manager().get_admin_option_clicked().set("");
    }

    private void profile()
    {
        Model.get_model().get_view_manager().get_admin_option_clicked().set("profile");
    }

    private void clientele()
    {
        Model.get_model().get_view_manager().get_admin_option_clicked().set("clientele");
    }

    private void activity()
    {
        Model.get_model().get_view_manager().get_admin_option_clicked().set("activity");
    }

    private void create_account()
    {
        Model.get_model().get_view_manager().get_admin_option_clicked().set("account");
    }

}
