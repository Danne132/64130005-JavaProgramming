module bt.duyan.paint {
    requires javafx.controls;
    requires javafx.fxml;


    opens bt.duyan.paint to javafx.fxml;
    exports bt.duyan.paint;
}