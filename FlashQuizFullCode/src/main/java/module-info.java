module th.hoangduyan.flashquizfullcode {
    requires javafx.controls;
    requires javafx.fxml;


    opens th.hoangduyan.flashquizfullcode to javafx.fxml;
    exports th.hoangduyan.flashquizfullcode;
}