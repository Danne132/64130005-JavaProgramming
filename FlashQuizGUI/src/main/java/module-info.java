module th.hoangduyan.flashquizgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens th.hoangduyan.flashquizgui to javafx.fxml;
    exports th.hoangduyan.flashquizgui;
}