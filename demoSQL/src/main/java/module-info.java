module bt.duyan.demosql {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens bt.duyan.demosql to javafx.fxml;
    exports bt.duyan.demosql;
}