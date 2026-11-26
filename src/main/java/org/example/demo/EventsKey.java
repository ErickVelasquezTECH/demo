package org.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventsKey extends Application {
    private static Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception {


        VBox root=new VBox();

        TextField textField=new TextField();

        root.getChildren().add(textField);



        scene=new Scene(root, 400,400);


        scene.setOnKeyPressed(e->{
            System.out.println("Tecla pulsada: "+e.getCode());
        });

        primaryStage.setScene(scene);
        primaryStage.show();



    }
}
