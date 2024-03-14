module com.example.exercise_79_javafx_launch_parameters {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercise_79_javafx_launch_parameters to javafx.fxml;
    exports com.example.exercise_79_javafx_launch_parameters;
}