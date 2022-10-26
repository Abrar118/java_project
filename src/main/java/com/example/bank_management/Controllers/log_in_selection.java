package com.example.bank_management.Controllers;

import com.example.bank_management.Model.Model;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class log_in_selection implements Initializable
{
    public FontAwesomeIconView admin_logo;
    public FontAwesomeIconView user_logo;
    public FontAwesomeIconView selection_back_arrow;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        selection_back_arrow.setOnMouseClicked(MouseEvent -> {
            try {back_button_clicked();}
            catch (IOException e) {throw new RuntimeException(e);}});
    }

    public void on_mouse_click(MouseEvent mouse_event) throws IOException
    {
        if(mouse_event.getSource().equals(user_logo)) Model.get_model().get_view_manager().get_admin_or_user().set("user");
        else if(mouse_event.getSource().equals(admin_logo)) Model.get_model().get_view_manager().get_admin_or_user().set("admin");

        Model.get_model().get_view_manager().close_stage((Stage) user_logo.getScene().getWindow());
        Model.get_model().get_view_manager().show_log_in_window();
    }

    private void back_button_clicked() throws IOException
    {
        Model.get_model().get_view_manager().close_stage((Stage) selection_back_arrow.getScene().getWindow());
        Model.get_model().get_view_manager().start_greeting_window();
    }
}
