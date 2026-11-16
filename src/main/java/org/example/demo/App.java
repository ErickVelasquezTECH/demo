package org.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class App extends Application {
    private static Scene scene;

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root = new BorderPane();

        Button bt1 = new Button("Arriba");
        bt1.setMaxWidth(Double.MAX_VALUE);

        Button bt2 = new Button("Abajo");

        bt2.setMaxWidth(Double.MAX_VALUE);
        Button bt3 = new Button("Izquierda");

        bt3.setMaxHeight(Double.MAX_VALUE);
        Button bt4 = new Button("Derecha");
        bt4.setMaxHeight(Double.MAX_VALUE);

        Button bt5 = new Button("Centro");

        BorderPane.setMargin(bt1, new Insets(5, 5, 5, 5));
        BorderPane.setMargin(bt2, new Insets(5, 5, 5, 5));
        BorderPane.setMargin(bt3, new Insets(5, 5, 5, 5));
        BorderPane.setMargin(bt4, new Insets(5, 5, 5, 5));
        BorderPane.setMargin(bt5, new Insets(5, 5, 5, 5));

        root.setTop(bt1);
        root.setBottom(bt2);
        root.setLeft(bt3);
        root.setRight(bt4);
        root.setCenter(bt5);

        scene = new Scene(root, 300, 250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
