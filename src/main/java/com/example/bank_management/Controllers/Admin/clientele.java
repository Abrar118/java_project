package com.example.bank_management.Controllers.Admin;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class clientele implements Initializable
{
    public TextField search_bar;
    public FontAwesomeIconView search_button;
    public Label total_client;
    public Label my_client;
    public Button all_client_button;
    public Button my_client_button;
    public TableView my_client_table;
    public TableView all_client_table;
    public FontAwesomeIconView options;
    public Text add_client;
    public Text remove_client;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        my_client_button.setOnMouseClicked(this::table_switch);
        all_client_button.setOnMouseClicked(this::table_switch);
    }








    private void table_switch(MouseEvent mouseEvent)
    {
        if(mouseEvent.getSource().equals(my_client_button))
        {
            my_client_table.setVisible(true);
            all_client_table.setVisible(false);
        }
        else if(mouseEvent.getSource().equals(all_client_button))
        {
            my_client_table.setVisible(false);
            all_client_table.setVisible(true);
        }
    }
}
