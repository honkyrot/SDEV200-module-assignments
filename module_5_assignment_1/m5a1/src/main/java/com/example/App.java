// 10/2/2025
// hong rot
// sdev200  1
// MODULE 5, ASSIGNMENT 1

// display 4 images in a grid pane


package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 * JavaFX App
 */

public class App extends Application {
    public static void main(String[] args) {
        launch();
    }
    
    @Override
    public void start(Stage stage) {
        GridPane pane = new GridPane();
        pane.setHgap(10);
        pane.setVgap(10);

        // stupid stream thing I figured out
        Image image1 = new Image(getClass().getResourceAsStream("/flag1.gif"));
        Image image2 = new Image(getClass().getResourceAsStream("/flag2.gif"));
        Image image3 = new Image(getClass().getResourceAsStream("/flag6.gif")); 
        Image image4 = new Image(getClass().getResourceAsStream("/flag7.gif"));

        ImageView iv1 = new ImageView(image1);
        iv1.setFitWidth(150);
        iv1.setPreserveRatio(true);

        ImageView iv2 = new ImageView(image2);
        iv2.setFitWidth(150);
        iv2.setPreserveRatio(true);

        ImageView iv3 = new ImageView(image3);
        iv3.setFitWidth(150);
        iv3.setPreserveRatio(true);

        ImageView iv4 = new ImageView(image4);
        iv4.setFitWidth(150);
        iv4.setPreserveRatio(true);

        pane.add(iv1, 0, 0);
        pane.add(iv2, 1, 0);
        pane.add(iv3, 0, 1);
        pane.add(iv4, 1, 1);

        Scene scene = new Scene(pane, 400, 400);
        stage.setTitle("ShowImage");
        stage.setScene(scene);
        stage.show();
    }
}