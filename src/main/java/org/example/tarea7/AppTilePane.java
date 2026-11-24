package org.example.tarea7;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class AppTilePane extends Application {

    private static Scene scene;

    @Override
    public void start(Stage primaryStage) {
        //TilePane
        TilePane root = new TilePane();
        Button[]buttons=new Button[5];
        for (int i = 0; i <buttons.length ; i++) {
            buttons[i]=new Button("Boton: "+(i+1));
            root.getChildren().add(buttons[i]);
        }
        //Tamaño de las celdas
        root.setPrefTileWidth(200);
        root.setPrefTileHeight(80);
        //Quitamos los espacios para ver que cambia exactamente
        root.setHgap(0);
        root.setVgap(0);



        root.setOrientation(Orientation.VERTICAL);
        scene = new Scene(root, 400, 450);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("TilePane JavaFX de Erick");

    }

    public static void main(String[] args) {
        launch();
    }
}
