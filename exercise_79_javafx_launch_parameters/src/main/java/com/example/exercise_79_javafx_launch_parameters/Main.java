package com.example.exercise_79_javafx_launch_parameters;

import javafx.application.Application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Anna sovellukselle otsikko: ");
        String title = reader.nextLine();

        Application.launch(HelloApplication.class,
                "--title=" + title);

    }

}
