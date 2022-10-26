package com.example.bank_management;

import com.example.bank_management.Model.Model;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {
        Model.get_model().get_view_manager().start_greeting_window();
    }

    public static void main(String[] args)
    {
        launch();
    }
}