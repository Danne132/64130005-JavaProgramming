module th.hoangduyan.basicgui_bmi {
    requires javafx.controls;
    requires javafx.fxml;


    opens th.hoangduyan.basicgui_bmi to javafx.fxml;
    exports th.hoangduyan.basicgui_bmi;
}