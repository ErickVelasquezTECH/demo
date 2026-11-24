package org.example.tarea7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuTilePane extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Contenedor principal
        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(25));

        // Título
        Label titulo = new Label("Panel de administracion");
        titulo.setStyle(
                "-fx-font-size: 22px;" +
                        "-fx-font-weight: bold;"
        );

        Label descripcion = new Label("Selecciona una opcion");

        // Contenedor del menú
        TilePane menu = new TilePane();
        menu.setHgap(10);
        menu.setVgap(10);
        menu.setAlignment(Pos.CENTER);

        // Tamaño uniforme de las celdas
        menu.setPrefTileWidth(110);
        menu.setPrefTileHeight(70);

        // Botones
        Button btn1 = new Button("Usuarios");
        Button btn2 = new Button("Productos");
        Button btn3 = new Button("Ventas");
        Button btn4 = new Button("Informes");
        Button btn5 = new Button("Ajustes");
        Button btn6 = new Button("Ayuda");

        Button[] botones = {
                btn1, btn2, btn3, btn4, btn5, btn6
        };

        for (Button boton : botones) {
            boton.setPrefSize(105, 65);

            boton.setStyle(
                    "-fx-background-color: #a1e09b;" +
                            "-fx-text-fill: #104600;" +
                            "-fx-background-radius: 8;"
            );
        }

        menu.getChildren().addAll(botones);

        root.getChildren().addAll(
                titulo, descripcion, menu
        );

        Scene scene = new Scene(root, 450, 350);

        primaryStage.setTitle("TilePane - Panel");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}