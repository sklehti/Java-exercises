module com.example.exercise_81_same_scane_with_multiple_layouts {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercise_81_same_scane_with_multiple_layouts to javafx.fxml;
    exports com.example.exercise_81_same_scane_with_multiple_layouts;
}