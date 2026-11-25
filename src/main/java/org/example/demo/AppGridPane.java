package org.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class AppGridPane extends Application {
    private static Scene scene;


    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane root=new GridPane(5.0,5.0);

        TextField lblscanner=new TextField ();
        root.add(lblscanner,1,1,4,1);
        String[]strings={"7","8","9","+","4","5","6","-","1","2","3","x","C","0","=","/"};
        int colum=1;
        int row1=2;
        for (int i = 0; i <strings.length ; i++) {
            String temp=strings[i];

            root.add(new Button(temp), colum,row1);

            if (colum==4){
                colum=1;
                row1++;
            }else {
                colum++;
            }

        }

        for (int i = 0; i < 4; i++) {
            ColumnConstraints col = new ColumnConstraints();
            col.setHgrow(Priority.ALWAYS); // Permite crecer a lo ancho
            col.setFillWidth(true);
            root.getColumnConstraints().add(col);
        }

// Para tus 5 filas (1 del TextField + 4 de botones)
        for (int i = 0; i < 5; i++) {
            RowConstraints row = new RowConstraints();
            row.setVgrow(Priority.ALWAYS); // Permite crecer a lo alto
            row.setFillHeight(true);
            root.getRowConstraints().add(row);
        }

        VBox.setMargin(lblscanner, new Insets(30));



        scene=new Scene(root, 500,500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("GridPane - JavaFX");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
