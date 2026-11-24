package org.example.tarea7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuFlowPane extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Contenedor principal
        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(25));

        // Título
        Label titulo = new Label("Tienda de informatica");
        titulo.setStyle(
                "-fx-font-size: 22px;" +
                        "-fx-font-weight: bold;"
        );

        Label descripcion = new Label("Selecciona una categoria");

        // Contenedor de categorías
        FlowPane categorias = new FlowPane();
        categorias.setHgap(10);
        categorias.setVgap(10);
        categorias.setAlignment(Pos.CENTER);

        // Botones
        Button btn1 = new Button("Portatiles");
        Button btn2 = new Button("Ratones");
        Button btn3 = new Button("Teclados mecanicos");
        Button btn4 = new Button("Monitores");
        Button btn5 = new Button("Componentes PC");
        Button btn6 = new Button("Accesorios");

        // Estilo de los botones
        Button[] botones = {
                btn1, btn2, btn3, btn4, btn5, btn6
        };

        for (Button boton : botones) {
            boton.setStyle(
                    "-fx-background-color: #ffd9b3;" +
                            "-fx-text-fill: #3b1b01;" +
                            "-fx-background-radius: 8;"
            );
        }

        categorias.getChildren().addAll(botones);

        root.getChildren().addAll(
                titulo, descripcion, categorias
        );

        Scene scene = new Scene(root, 450, 300);

        primaryStage.setTitle("FlowPane - Categorias");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}