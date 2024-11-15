module project.duyan.speechtotextvosk {
    requires javafx.controls;
    requires javafx.fxml;
    requires vosk;
    requires java.desktop;


    opens project.duyan.speechtotextvosk to javafx.fxml;
    exports project.duyan.speechtotextvosk;
}