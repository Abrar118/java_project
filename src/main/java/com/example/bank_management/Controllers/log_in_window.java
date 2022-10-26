package com.example.bank_management.Controllers;

import com.example.bank_management.Model.Model;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.beans.property.StringProperty;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class log_in_window implements Initializable
{
    public Button sign_in_button;
    public PasswordField password;
    public TextField username;
    public FontAwesomeIconView log_in_back_arrow;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        log_in_back_arrow.setOnMouseClicked(MouseEvent -> {
            try{back_button_clicked();}
            catch (IOException e){throw new RuntimeException(e);}});
    }

    public void sign_in_button_click() throws IOException
    {
        Model.get_model().get_view_manager().close_stage((Stage) sign_in_button.getScene().getWindow());

        StringProperty admin_or_user = Model.get_model().get_view_manager().get_admin_or_user();

        if (admin_or_user.get().equals("user")) Model.get_model().get_view_manager().show_customer_view();
        else if (admin_or_user.get().equals("admin")) Model.get_model().get_view_manager().show_admin_view();
    }

    private void back_button_clicked() throws IOException
    {
        Model.get_model().get_view_manager().close_stage((Stage) log_in_back_arrow.getScene().getWindow());
        Model.get_model().get_view_manager().show_selection_window();
    }
}
