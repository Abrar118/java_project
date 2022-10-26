package com.example.bank_management.Controllers;

import com.example.bank_management.Model.Model;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class about_us_controller implements Initializable
{

    public FontAwesomeIconView exit_button;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        exit_button.setOnMouseClicked(MouseEvent -> exit_button_clicked());
    }

    private void exit_button_clicked()
    {
        Model.get_model().get_view_manager().close_stage((Stage)exit_button.getScene().getWindow());
    }
}
