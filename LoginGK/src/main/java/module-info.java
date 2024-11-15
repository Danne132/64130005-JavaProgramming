module bt.duyan.logingk {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens bt.duyan.logingk to javafx.fxml;
    exports bt.duyan.logingk;
}