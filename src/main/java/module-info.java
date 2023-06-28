module com.example.pharmacy_management_system {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pharmacy_management_system to javafx.fxml;
    exports com.example.pharmacy_management_system;
}