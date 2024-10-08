package com.example.bmi1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class BMI {
    @FXML
    private TextField txt_H, txt_W, txt_BMI, txt_E;
    public void tinhBMI(ActionEvent event){
        float height = Float.parseFloat(txt_H.getText());
        float weight = Float.parseFloat(txt_W.getText());
        float BMI = weight/(height*height);
        String getBMI = String.valueOf(BMI);
        txt_BMI.setText(getBMI);
        if(BMI >= 40.0f){
            txt_E.setText("Béo phì cấp III");
        } else if (BMI >= 35.0f){
            txt_E.setText("Béo phì cấp II");
        } else if (BMI >= 30.0f) {
            txt_E.setText("Béo phì cấp I");
        } else if (BMI >= 25.0f) {
            txt_E.setText("Thừa cân");
        } else if (BMI >= 18.5f) {
            txt_E.setText("Bình thường");
        } else{
            txt_E.setText("Ốm");
        }
    }
}
