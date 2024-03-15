package com.example.exercises_80_javafx_multiple_scenes;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        // first view
        VBox vBox = new VBox();
        Label label1 = new Label("Kirjoita nimesi ja aloita");
        TextField textField = new TextField();
        Button button = new Button("Aloita");

        textField.setMaxWidth(250);
        button.setMaxWidth(250);
        vBox.setPrefSize(300,200);
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.CENTER);
        vBox.setStyle("-fx-background-color: #add8e6;");

        vBox.getChildren().addAll(label1, textField, button);

        Scene scene1 = new Scene(vBox);
        stage.setScene(scene1);


        // second view
        BorderPane borderPane2 = new BorderPane();
        Label label2 = new Label();

        HBox hBox = new HBox();
        hBox.getChildren().add(label2);
        hBox.setAlignment(Pos.CENTER);
        hBox.setStyle("-fx-background-color: #add8e6;");
        label2.setStyle("-fx-text-fill: #fff; -fx-font-size: 20px; -fx-font-weight: bold;");

        Scene scene2 = new Scene(hBox, 300, 200);


        // actions
        button.setOnAction(event -> {
            label2.setText("Tervetuloa " + textField.getText() + "!");
            stage.setScene(scene2);
        });


        stage.show();

    }

}