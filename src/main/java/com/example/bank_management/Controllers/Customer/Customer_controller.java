package com.example.bank_management.Controllers.Customer;

import com.example.bank_management.Model.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Customer_controller implements Initializable
{

    public BorderPane main_border_pane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        Model.get_model().get_view_manager().get_customer_option_clicked().addListener(((observableValue, old_value, new_value) -> {
            try {change_border_pane(new_value);}
            catch (IOException e) {throw new RuntimeException(e);}
        }));
    }

    private void change_border_pane(String value) throws IOException
    {
        switch (value)
        {
            case "transaction" -> main_border_pane.setCenter(Model.get_model().get_view_manager().get_transaction_view());
            case "deposit" -> main_border_pane.setCenter(Model.get_model().get_view_manager().get_deposit_dashboard());
            case "about" -> Model.get_model().get_view_manager().show_about_window();
            case "profile" -> main_border_pane.setCenter(Model.get_model().get_view_manager().get_profile_dashboard());
            default -> main_border_pane.setCenter(Model.get_model().get_view_manager().get_customer_dashboard());
        }
    }
}
