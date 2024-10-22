module com.example.pokemon {
    requires javafx.controls;
    requires javafx.fxml;


    opens bt.duyan.pokemon to javafx.fxml;
    exports bt.duyan.pokemon;
}