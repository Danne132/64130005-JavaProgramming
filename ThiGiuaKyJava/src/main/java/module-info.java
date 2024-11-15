module thi.duyan.thigiuakyjava {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.jsobject;
    requires json.simple;


    opens thi.duyan.thigiuakyjava to javafx.fxml;
    exports thi.duyan.thigiuakyjava;
}