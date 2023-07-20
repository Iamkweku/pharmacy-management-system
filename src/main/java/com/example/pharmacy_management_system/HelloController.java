package com.example.pharmacy_management_system;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * The HelloController class represents the controller for the main view of the pharmacy management system.
 * It handles the interaction between the user interface defined in the FXML file and the underlying logic.
 */
public class HelloController {
    @FXML

     /**
     * The welcomeText Label is a JavaFX component that displays a welcome message to the user.
     * It is defined in the FXML file and injected into this controller using @FXML annotation.
     */
    
     @FXML
    private Label welcomeText;

    /**
     * The onHelloButtonClick method is called when the user clicks the "Hello" button on the main view.
     * It updates the text of the welcomeText Label to display a welcome message.
     * This method is triggered by the corresponding event defined in the FXML file.
     */

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}