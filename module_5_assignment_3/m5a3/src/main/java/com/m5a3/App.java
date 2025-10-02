// 10/2/2025
// hong rot
// sdev200 
// MODULE 5, ASSIGNMENT 3

// 4 sliders doing rgba color change

package com.m5a3;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        // panes
        Pane root = new Pane();
        root.setPrefSize(400, 300);

        // RED
        Slider red = new Slider(0, 255, 0);
        Label red_label = new Label("Red: 0");

        red.setLayoutX(50);
        red.setLayoutY(50);

        red_label.setLayoutX(300);
        red_label.setLayoutY(50);

        // GREEN
        Slider green = new Slider(0, 255, 0);
        Label green_label = new Label("Green: 0");

        green.setLayoutX(50);
        green.setLayoutY(100);

        green_label.setLayoutX(300);
        green_label.setLayoutY(100);

        // BLUE
        Slider blue = new Slider(0, 255, 0);
        Label blue_label = new Label("Blue: 0");

        blue.setLayoutX(50);
        blue.setLayoutY(150);

        blue_label.setLayoutX(300);
        blue_label.setLayoutY(150);

        // ALPHA
        Slider alpha = new Slider(0, 1, 1);
        Label alpha_label = new Label("Alpha: 1.0");

        alpha.setLayoutX(50);
        alpha.setLayoutY(200);

        alpha_label.setLayoutX(300);
        alpha_label.setLayoutY(200);

        // listeners

        red.valueProperty().addListener((obs, oldVal, newVal) -> {
            red_label.setText(String.format("Red: %.0f", newVal));
            root.setStyle(String.format("-fx-background-color: rgba(%.0f, %.0f, %.0f, %.2f);",
                    red.getValue(), green.getValue(), blue.getValue(), alpha.getValue()));
        });

        green.valueProperty().addListener((obs, oldVal, newVal) -> {
            green_label.setText(String.format("Green: %.0f", newVal));
            root.setStyle(String.format("-fx-background-color: rgba(%.0f, %.0f, %.0f, %.2f);",
                    red.getValue(), green.getValue(), blue.getValue(), alpha.getValue()));
        });

        blue.valueProperty().addListener((obs, oldVal, newVal) -> {
            blue_label.setText(String.format("Blue: %.0f", newVal));
            root.setStyle(String.format("-fx-background-color: rgba(%.0f, %.0f, %.0f, %.2f);",
                    red.getValue(), green.getValue(), blue.getValue(), alpha.getValue()));
        });

        alpha.valueProperty().addListener((obs, oldVal, newVal) -> {
            alpha_label.setText(String.format("Alpha: %.2f", newVal));
            root.setStyle(String.format("-fx-background-color: rgba(%.0f, %.0f, %.0f, %.2f);",
                    red.getValue(), green.getValue(), blue.getValue(), alpha.getValue()));
        });

        // root
        root.getChildren().addAll(red, red_label, green, green_label, blue, blue_label, alpha, alpha_label);
        root.setStyle("-fx-background-color: rgba(0, 0, 0, 1);");
        scene = new Scene(root);

        stage.setTitle("RGBA Color Sliders");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}