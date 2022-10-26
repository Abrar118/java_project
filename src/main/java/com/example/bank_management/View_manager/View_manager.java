package com.example.bank_management.View_manager;

import com.example.bank_management.HelloApplication;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class View_manager
{
    private AnchorPane customer_dashboard;
    private AnchorPane transaction_view;
    private AnchorPane deposit_view;
    private AnchorPane customer_profile;
    private final StringProperty customer_option_clicked;
    private final StringProperty admin_or_user;
    private final StringProperty admin_option_clicked;
    private AnchorPane admin_menu;
    private AnchorPane create_account;
    private AnchorPane admin_profile;
    private AnchorPane admin_activity;
    private AnchorPane clientele;

    public View_manager()
    {
        this.customer_option_clicked=new SimpleStringProperty("");
        this.admin_or_user =  new SimpleStringProperty("");
        this.admin_option_clicked =  new SimpleStringProperty("");
    }



    //customer views
    public AnchorPane get_customer_dashboard() throws IOException
    {
        if(customer_dashboard==null) customer_dashboard=new FXMLLoader(HelloApplication.class.getResource("/FXML/customer/dashboard.fxml")).load();
        return customer_dashboard;
    }

    public AnchorPane get_transaction_view() throws IOException
    {
        if(transaction_view==null) transaction_view=new FXMLLoader(HelloApplication.class.getResource("/FXML/customer/transactions.fxml")).load();
        return transaction_view;
    }

    public AnchorPane get_deposit_dashboard() throws IOException
    {
        if(deposit_view==null) deposit_view=new FXMLLoader(HelloApplication.class.getResource("/FXML/customer/deposit.fxml")).load();
        return deposit_view;
    }

    public AnchorPane get_profile_dashboard() throws IOException
    {
        if(customer_profile==null) customer_profile=new FXMLLoader(HelloApplication.class.getResource("/FXML/customer/customer_profile.fxml")).load();
        return customer_profile;
    }

    public void show_customer_view() throws IOException
    {
        FXMLLoader fxmlLoader =new FXMLLoader(HelloApplication.class.getResource("/FXML/customer/customer.fxml"));
        create_stage(fxmlLoader);
    }

    public StringProperty get_customer_option_clicked()
    {
        return customer_option_clicked;
    }

    //customer view end






    ///Admin views
    public AnchorPane get_admin_menu() throws IOException
    {
        if(admin_menu==null) admin_menu = new FXMLLoader(HelloApplication.class.getResource("/FXML/Admin/admin_menu.fxml")).load();
        return  admin_menu;
    }

    public AnchorPane get_create_account() throws IOException
    {
        if(create_account==null) create_account=new FXMLLoader(HelloApplication.class.getResource("/FXML/Admin/create_account.fxml")).load();
        return create_account;
    }

    public AnchorPane get_admin_profile() throws IOException
    {
        if(admin_profile==null) admin_profile = new FXMLLoader(HelloApplication.class.getResource("/FXML/Admin/admin_profile.fxml")).load();
        return admin_profile;
    }

    public AnchorPane get_admin_activity() throws IOException
    {
        if(admin_activity==null) admin_activity= new FXMLLoader(HelloApplication.class.getResource("/FXML/Admin/admin_activity.fxml")).load();
        return admin_activity;
    }

    public AnchorPane get_clientele() throws IOException
    {
        if(clientele==null) clientele = new FXMLLoader(HelloApplication.class.getResource("/FXML/Admin/clientele.fxml")).load();
        return clientele;
    }

    public void show_admin_view() throws IOException
    {
        FXMLLoader fxmlLoader=new FXMLLoader(HelloApplication.class.getResource("/FXML/Admin/admin.fxml"));
        create_stage(fxmlLoader);
    }

    public StringProperty get_admin_option_clicked() {return admin_option_clicked;}
    ///admin view end






    //general views
    public void start_greeting_window() throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/FXML/greeting_window.fxml"));
        create_stage(fxmlLoader);
    }

    public void show_selection_window() throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/FXML/log_in_selection.fxml"));
        create_stage(fxmlLoader);
    }

    public void show_log_in_window() throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/FXML/log_in.fxml"));
        create_stage(fxmlLoader);
    }

    public void show_about_window() throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/FXML/about_us.fxml"));
        create_stage(fxmlLoader);
    }

    public StringProperty get_admin_or_user()
    {
        return admin_or_user;
    }

    public void create_stage(FXMLLoader fxmlLoader) throws IOException
    {
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage=new Stage();
        stage.setTitle("MATBank");
        stage.getIcons().add(new Image("G:\\Java Khet projects\\Bank_management\\src\\main\\resources\\Images\\icon.jpg"));
        stage.setScene(scene);
        stage.show();
    }

    public void close_stage(Stage stage)
    {
        stage.close();
    }
}