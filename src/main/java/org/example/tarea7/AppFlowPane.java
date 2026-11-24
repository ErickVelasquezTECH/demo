package org.example.tarea7;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import org.ietf.jgss.Oid;


public class AppFlowPane extends Application {

    private static Scene scene;

    @Override
    public void start(Stage primaryStage) {

        FlowPane root = new FlowPane();
        Button[]buttons=new Button[10];
        for (int i = 0; i <buttons.length ; i++) {
            buttons[i]=new Button("Boton: "+(i+1));
            root.getChildren().add(buttons[i]);
        }
        //Boton con texto mas grande
        buttons[4].setText("Diego el gran tutor");

        root.setHgap(10);
        root.setVgap(10);
        root.setOrientation(Orientation.VERTICAL);
        scene = new Scene(root, 400, 450);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("FlowPane JavaFX de Erick");

    }

    public static void main(String[] args) {
        launch();
    }
}

