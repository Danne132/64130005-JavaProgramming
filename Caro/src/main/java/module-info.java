module com.example.caro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.caro to javafx.fxml;
    exports com.example.caro;
}