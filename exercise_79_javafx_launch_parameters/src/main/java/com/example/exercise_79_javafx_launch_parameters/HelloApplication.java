package com.example.exercise_79_javafx_launch_parameters;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parameters params = getParameters();
        String appTitle = params.getNamed().get("title");

        stage.setTitle(appTitle);
        stage.show();
    }
}