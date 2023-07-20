module com.example.pharmacy_management_system {
  
    // Requires the JavaFX controls module for using JavaFX UI components.
    requires javafx.controls;
   
    // Requires the JavaFX FXML module for using FXML files to define the UI layout.
    requires javafx.fxml;


    // Opens the package com.example.pharmacy_management_system to the JavaFX FXML module.
    // This allows JavaFX to access and interact with classes in this package when loading FXML files.
    opens com.example.pharmacy_management_system to javafx.fxml;
    
    // Exports the package com.example.pharmacy_management_system.
    // This makes the classes in this package accessible to other modules that depend on this module.
    exports com.example.pharmacy_management_system;
}