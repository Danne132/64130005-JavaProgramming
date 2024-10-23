module bt.duyan.demosql {
    requires javafx.controls;
    requires javafx.fxml;


    opens bt.duyan.demosql to javafx.fxml;
    exports bt.duyan.demosql;
}