package com.example.bank_management.Controllers.Admin;

import com.example.bank_management.Model.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Admin_controller implements Initializable
{


    public BorderPane border_pane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        Model.get_model().get_view_manager().get_admin_option_clicked().addListener((observableValue, old_value, new_value) -> {
            try {change_border_pane(new_value);}
            catch (IOException e){throw new RuntimeException(e);}
        });
    }

    private void change_border_pane(String new_value) throws IOException
    {
        border_pane.setLeft(Model.get_model().get_view_manager().get_admin_menu());

        switch (new_value)
        {
            case "account" -> border_pane.setCenter(Model.get_model().get_view_manager().get_create_account());
            case "profile" -> border_pane.setCenter(Model.get_model().get_view_manager().get_admin_profile());
            case "activity" -> border_pane.setCenter(Model.get_model().get_view_manager().get_admin_activity());
            case "clientele" -> border_pane.setCenter(Model.get_model().get_view_manager().get_clientele());
        }
    }
}
