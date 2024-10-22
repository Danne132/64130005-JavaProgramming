module bt.duyan.demobanhang {
    requires javafx.controls;
    requires javafx.fxml;


    opens bt.duyan.demobanhang to javafx.fxml;
    exports bt.duyan.demobanhang;
}