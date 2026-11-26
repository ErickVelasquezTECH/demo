package org.example.demo;

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

public class ChangeScene extends Application {
    private static Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception {

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



        //Nuevo root
        VBox root2=new VBox(5);
        root2.setAlignment(Pos.CENTER);
        Label labelwelcome = new Label("Bienvenido!!");
        labelwelcome.setFont(new Font("Arial", 30));
        labelwelcome.setStyle(
                "-fx-font-weight: bold;"
        );
        Button buttonCerrarSesion = new Button("Cerrar Sesion");
        root2.getChildren().addAll(labelwelcome, buttonCerrarSesion);

        buttonCerrarSesion.setStyle(
                "-fx-background-color: #ff5151;" +
                        "-fx-text-fill: #ffffff;" +
                        "-fx-font-weight: bold;" +
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10 20;"
        );

        buttonEntrar.setOnAction(event -> {
            scene=new Scene(root2, 400, 400);
            primaryStage.setScene(scene);
        });









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
}
