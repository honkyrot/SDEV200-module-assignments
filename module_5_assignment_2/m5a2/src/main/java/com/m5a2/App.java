// 10/2/2025
// hong rot
// sdev200
// MODULE 5, ASSIGNMENT 2

// interactive button that changes color on click

package com.m5a2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * JavaFX App - Interactive Circle that changes color on click
 */
public class App extends Application {
    @Override
    public void start(Stage stage) {
        // circles
        Circle circle = new Circle(50);
        circle.setFill(Color.WHEAT);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2);
        
        // on press its black
        circle.setOnMousePressed(event -> {
            circle.setFill(Color.BLACK);
        });

        // on release, change back to original color
        circle.setOnMouseReleased(event -> {
            circle.setFill(Color.WHEAT);
        });
        
        // create layout and add circle
        StackPane root = new StackPane();
        root.getChildren().add(circle);
        
        // create scene
        Scene scene = new Scene(root, 300, 300);
        
        // set up the stage
        stage.setTitle("Interactive Color-Changing Circle");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}