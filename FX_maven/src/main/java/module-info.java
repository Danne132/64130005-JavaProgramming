module com.example.fx_maven {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires json.simple;


    opens com.example.fx_maven to javafx.fxml;
    exports com.example.fx_maven;
}