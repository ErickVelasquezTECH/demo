package org.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class CalculadoraApp extends Application {
    private static Scene scene;


    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane root = new GridPane();
        root.setHgap(8);
        root.setVgap(8);
        root.setPadding(new Insets(12));

        TextField lblscanner = new TextField("5+5");
        lblscanner.setAlignment(Pos.CENTER_RIGHT);
        lblscanner.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);



        GridPane.setMargin(lblscanner, new Insets(0, 0, 8, 0));
        GridPane.setVgrow(lblscanner, Priority.ALWAYS);

        root.add(lblscanner, 0, 0, 4, 1);

        String[] strings = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "x", "C", "0", "=", "/"};
        int colum = 0;
        int row = 1;

        for (String temp : strings) {
            Button btn = new Button(temp);
            btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

            GridPane.setHgrow(btn, Priority.ALWAYS);
            GridPane.setVgrow(btn, Priority.ALWAYS);


            root.add(btn, colum, row);
            colum++;
            if (colum == 4) {
                colum = 0;
                row++;
            }
        }



        Scene scene = new Scene(root, 320, 280);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculadora - Erick");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
