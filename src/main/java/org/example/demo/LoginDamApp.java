package org.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class LoginDamApp extends Application {

    private static Scene scene;


    @Override
    public void start(Stage primaryStage){

        VBox root = new VBox();


        Label labelTitle = new Label("LOGIN DAM");
        labelTitle.setFont(new Font("Arial", 18));


        Label user = new Label("Usuario");
        TextField userText = new TextField();

        Label password = new Label("Contraseña");
        PasswordField passwordField = new PasswordField();

        Button bt1 = new Button("Entrar");
        Button bt2 = new Button("Salir");





        List<Node> nodes = new ArrayList<>();
        nodes.add(labelTitle);
        nodes.add(user);
        nodes.add(userText);
        nodes.add(password);
        nodes.add(passwordField);

        HBox botones=new HBox(30);
        botones.getChildren().add(bt1);
        botones.getChildren().add(bt2);


        nodes.add(botones);


        root.setAlignment(Pos.CENTER);
        botones.setAlignment(Pos.CENTER);


        VBox.setMargin(labelTitle, new Insets(10, 0, 40, 0));
        VBox.setMargin(userText, new Insets(5, 30, 5, 30));
        VBox.setMargin(passwordField, new Insets(5, 30, 20, 30));


        scene = new Scene(root, 400, 450);

        primaryStage.setScene(scene);

        primaryStage.show();
        primaryStage.setTitle("Login JavaFX de Erick");
    }

    public static void main(String[] args) {
        launch();
    }
}
