package org.example.demo;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppFlowPane extends Application {

    private static Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception {

        FlowPane root=new FlowPane();


        List<Button>buttons1=new ArrayList<>();
        Button[] buttons=new Button[10];

        int cont = 0;

        for (int i = 0; i <10 ; i++) {
            buttons1.add(new Button(String.valueOf(i)));
            root.getChildren().add(buttons1);
        }
        for (var button:buttons){
            button = new Button(String.valueOf(cont));
            cont++;
            root.getChildren().add(button);
        }







        root.setHgap(10);
        root.setVgap(10);
        root.setOrientation(Orientation.VERTICAL);



        scene = new Scene(root, 400, 450);
        //1
        primaryStage.setScene(scene);
        //2
        primaryStage.show();
        primaryStage.setTitle("FlowPane JavaFX de Erick");

    }
}
