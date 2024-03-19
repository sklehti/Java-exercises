package com.example.exercise_81_same_scane_with_multiple_layouts;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // main view
        BorderPane borderPane = new BorderPane();
        HBox hBox = new HBox();
        Button button1 = new Button("Vitsi");
        Button button2 = new Button("Vastaus");
        Button button3 = new Button("Selitys");

        button1.setCursor(Cursor.HAND);
        button2.setCursor(Cursor.HAND);
        button3.setCursor(Cursor.HAND);

        hBox.setSpacing(20);
        hBox.setAlignment(Pos.CENTER);
        borderPane.setPrefSize(300,100);

        hBox.getChildren().addAll(button1, button2, button3);
        borderPane.setTop(hBox);

        StackPane stackPane1 = createView("What do you call a bear with no teeth?");
        StackPane stackPane2 = createView("A gummy bear.");
        StackPane stackPane3 = createView("Some explanations here...");


        // actions
        button1.setOnAction(event -> {
            borderPane.setCenter(stackPane1);

        });
        button2.setOnAction(event -> {
            borderPane.setCenter(stackPane2);

        });
        button3.setOnAction(event -> {
            borderPane.setCenter(stackPane3);
        });

        borderPane.setCenter(stackPane1);


        Scene scene = new Scene(borderPane);
        stage.setScene(scene);
        stage.show();
    }

    private StackPane createView (String text) {
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(new Label(text));

        return stackPane;
    }

}