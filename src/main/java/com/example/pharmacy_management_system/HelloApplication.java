package com.example.pharmacy_management_system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The main entry point for the Pharmacy Management System JavaFX application.
 * This class extends the javafx.application.Application class and is responsible for launching the application.
 * The application loads the "hello-view.fxml" file, which defines the main user interface layout.
 */

public class HelloApplication extends Application {
    @Override

     /**
     * The start method is called when the JavaFX application is launched.
     * It initializes the user interface and sets up the primary stage (window) for the application.
     *
     * @param stage The primary stage (window) of the application.
     * @throws IOException If there is an error while loading the "hello-view.fxml" file.
     */
    public void start(Stage stage) throws IOException {
        
        // Create an FXMLLoader to load the "hello-view.fxml" file, which defines the user interface layout.
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
       
          // Load the FXML file and create a Scene with the root node as the loaded content.
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

     /**
     * The main method launches the Pharmacy Management System application by calling the launch() method.
     *
     * @param args Command-line arguments (unused in this application).
     */
    public static void main(String[] args) {
        launch();
    }
}