package org.example.login;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class LoginDamApp extends Application {

    private static Scene scene;


    @Override
    public void start(Stage primaryStage){

        VBox root = new VBox(5);


        Label labelTitle = new Label("LOGIN DAM");
        labelTitle.setFont(new Font("Arial", 18));


        Label userLbl = new Label("Usuario");
        TextField userText = new TextField();

        Label passwordLbl = new Label("Contraseña");
        PasswordField passwordField = new PasswordField();

        Button buttonEntrar = new Button("Entrar");
        Button buttonSalir = new Button("Salir");

        //Botones con HBox
        HBox botones = new HBox(30, buttonEntrar, buttonSalir);

        root.getChildren().addAll(
                labelTitle,
                userLbl,
                userText,
                passwordLbl,
                passwordField,
                botones
        );


        root.setAlignment(Pos.CENTER);
        botones.setAlignment(Pos.CENTER);


        VBox.setMargin(labelTitle, new Insets(10, 0, 40, 0));
        VBox.setMargin(userText, new Insets(5, 30, 5, 30));
        VBox.setMargin(passwordField, new Insets(5, 30, 20, 30));

        //ESTILOS
        labelTitle.setStyle(
                "-fx-font-weight: bold;"
        );
        userLbl.setStyle(
                "-fx-font-weight: bold;"
        );
        passwordLbl.setStyle(
                "-fx-font-weight: bold;"
        );

        userText.setStyle(
                "-fx-background-color: #ffffff;" +
                "-fx-border-color: #bec6df;" +
                "-fx-border-radius: 8;" +
                "-fx-padding: 10;"
        );
        passwordField.setStyle(
                "-fx-background-color: #ffffff;" +
                        "-fx-border-color: #bec6df;" +
                        "-fx-border-radius: 8;" +
                        "-fx-padding: 10;"
        );

        buttonEntrar.setStyle(
                "-fx-background-color: #304486;" +
                        "-fx-text-fill: #ffffff;" +
                        "-fx-font-weight: bold;" +
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10 20;"
        );

        buttonSalir.setStyle(
                "-fx-background-color: #9b6161;" +
                        "-fx-text-fill: #ffffff;" +
                        "-fx-font-weight: bold;" +
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10 20;"
        );

        scene = new Scene(root, 400, 450);

        primaryStage.setTitle("Login JavaFX de Erick");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
