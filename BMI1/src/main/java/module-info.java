module com.example.bmi1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.bmi1 to javafx.fxml;
    exports com.example.bmi1;
}