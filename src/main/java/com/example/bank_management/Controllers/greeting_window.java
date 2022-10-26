package com.example.bank_management.Controllers;

import com.example.bank_management.Model.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class greeting_window implements Initializable
{
    public AnchorPane enter;
    public AnchorPane policies;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        enter.setOnMouseClicked(mouseEvent -> {
            try{on_enter_click();}
            catch (IOException e){throw new RuntimeException(e);}
        });
    }

    private void on_enter_click() throws IOException
    {
        Stage stage = (Stage)enter.getScene().getWindow();
        Model.get_model().get_view_manager().close_stage(stage);
        Model.get_model().get_view_manager().show_selection_window();
    }

}
