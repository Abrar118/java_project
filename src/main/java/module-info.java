module com.example.bank_management
{
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;



    opens com.example.bank_management to javafx.fxml;
    exports com.example.bank_management;
    exports com.example.bank_management.Controllers;
    exports com.example.bank_management.Controllers.Admin;
    exports com.example.bank_management.Controllers.Customer;
    exports com.example.bank_management.View_manager;
    exports com.example.bank_management.Model;
}