package th.hoangduyan.basicgui_bmi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class BMIController{
    @FXML
    TextField txtHeight, txtWeight;
    @FXML
    Text txtKQ, txtDG;
    @FXML
    CheckBox checkAsian;
    double height, weight, bmi;


    public void tinhBMI(ActionEvent event) {
        height = Double.parseDouble(txtHeight.getText());
        weight = Double.parseDouble(txtWeight.getText());
        if(height <= 0 || weight <= 0){
            txtDG.setText("Chiều cao và cân nặng phải lớn hơn 0");
        }
        bmi = weight / (height * height);
        txtKQ.setText(String.valueOf(bmi));
        if(checkAsian.isSelected()){
            if(bmi < 17.5) txtDG.setText("Thiếu cân");
            else if (bmi < 22.99) txtDG.setText("Bình thường");
            else if (bmi < 27.99) txtDG.setText("Thừa cân");
            else txtDG.setText("Béo phì");
        } else {
            if(bmi < 18.5) txtDG.setText("Thiếu cân");
            else if (bmi < 24.99) txtDG.setText("Bình thường");
            else if (bmi < 29.99) txtDG.setText("Thừa cân");
            else txtDG.setText("Béo phì");
        }

    }
}