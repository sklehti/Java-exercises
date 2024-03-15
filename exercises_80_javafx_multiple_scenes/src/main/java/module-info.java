module com.example.exercises_80_javafx_multiple_scenes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercises_80_javafx_multiple_scenes to javafx.fxml;
    exports com.example.exercises_80_javafx_multiple_scenes;
}