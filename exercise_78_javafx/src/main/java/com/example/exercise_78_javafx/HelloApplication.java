/**
 * Good docs:
 * https://docs.oracle.com/javase/8/javase-clienttechnologies.htm
 * https://docs.oracle.com/javase/8/javafx/user-interface-tutorial/ui_controls.htm#JFXUI336
 *
 */

package com.example.exercise_78_javafx;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane borderPane = new BorderPane();
        TextArea textArea = new TextArea("");

        borderPane.setCenter(textArea);

        Text text1 = new Text();
        Text text2 = new Text();
        Text text3 = new Text();

        HBox hBox = new HBox();
        hBox.setSpacing(20);
        hBox.getChildren().addAll(text1,text2, text3);

        textArea.textProperty().addListener((observableValue, s, t1) -> {
            String [] arr = textArea.getText().split((" "));
            String longestString = Arrays.stream(arr).max(Comparator.comparingInt(String::length)).orElse(null);

            text1.setText("Kirjaimia: " + textArea.getText().length());
            text2.setText("Sanoja: " + arr.length);
            text3.setText("Pisin sana on: " + longestString);

        });





        borderPane.setBottom(hBox);
        Scene scene = new Scene(borderPane);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(HelloApplication.class);
    }
}