package org.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


import java.util.Random;

public class Adivinanza extends Application {
    private static Scene scene;
    Random random = new Random();
    private int x = random.nextInt(1, 100);


    @Override
    public void start(Stage primaryStage) throws NumberFormatException {
        VBox root = new VBox();

        Label labelTitle = new Label("ADIVINA EL NUMERO");
        labelTitle.setFont(new Font("Arial", 28));


        Label user = new Label("Introduce el numero:");
        TextField userText = new TextField();

        Label show = new Label();

        Button bt1 = new Button("Ingresar");
        Button bt2 = new Button("Reiniciar");
        Button bt3 = new Button("Salir");


        HBox botones = new HBox(30);
        botones.getChildren().add(bt1);
        botones.getChildren().add(bt2);
        botones.getChildren().add(bt3);

        root.getChildren().addAll(labelTitle, user, userText, show, botones);


        root.setAlignment(Pos.CENTER);
        botones.setAlignment(Pos.CENTER);


        VBox.setMargin(labelTitle, new Insets(10, 0, 40, 0));
        VBox.setMargin(userText, new Insets(5, 30, 5, 30));
        VBox.setMargin(show, new Insets(5, 30, 30, 30));

        root.setStyle("-fx-background-color: #121fff;");
        labelTitle.setStyle("-fx-text-fill: #ffffff;");
        user.setStyle("-fx-text-fill: #ffffff;");
        show.setStyle("-fx-text-fill: #ffffff;");


        bt1.setOnAction(e -> {
            String escrito = userText.getText();
            try {
                int numberFormat = Integer.parseInt(escrito.trim());
                action(show, numberFormat, x);
            } catch (NumberFormatException ex) {
                show.setText("Por favor, introduce un número válido.");
            }
        });
        bt2.setOnAction(e -> {
            x = random.nextInt(1, 100);
            show.setText("Numero nuevo generado!");
        });
        bt3.setOnAction(e -> primaryStage.close());


        scene = new Scene(root, 400, 450);

        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("Adivina el numero JavaFX de Erick");

    }


    public static void main(String[] args) {
        launch();
    }

    public void action(Label show, int number, int randomNumber) {
        if (number == randomNumber) {
            show.setText("Lo lograste!");
        } else if (number > randomNumber) {
            show.setText("El numero es menor");
        } else {
            show.setText("El numero es mayor");
        }
    }

}
