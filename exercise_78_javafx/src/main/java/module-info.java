module com.example.exercise_78_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercise_78_javafx to javafx.fxml;
    exports com.example.exercise_78_javafx;
}