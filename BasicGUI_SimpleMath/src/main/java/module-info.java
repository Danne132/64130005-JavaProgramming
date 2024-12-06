module th.hoangduyan.basicgui_simplemath {
    requires javafx.controls;
    requires javafx.fxml;


    opens th.hoangduyan.basicgui_simplemath to javafx.fxml;
    exports th.hoangduyan.basicgui_simplemath;
}