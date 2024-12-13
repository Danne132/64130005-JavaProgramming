module th.hoangduyan.simpledict {
    requires javafx.controls;
    requires javafx.fxml;


    opens th.hoangduyan.simpledict to javafx.fxml;
    exports th.hoangduyan.simpledict;
}