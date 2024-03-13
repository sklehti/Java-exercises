module com.example.exercise_77_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercise_77_javafx to javafx.fxml;
    exports com.example.exercise_77_javafx;
}