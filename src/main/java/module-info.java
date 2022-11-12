module com.example.practice_git {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practice_git to javafx.fxml;
    exports com.example.practice_git;
}