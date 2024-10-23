module bt.duyan.demosql_tableview {
    requires javafx.controls;
    requires javafx.fxml;


    opens bt.duyan.demosql_tableview to javafx.fxml;
    exports bt.duyan.demosql_tableview;
}