package th.hoangduyan.basicgui_simplemath;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MathController implements Initializable {
    @FXML
    TextField txtSoB, txtSoA, txtKQ;
    @FXML
    RadioButton radioCong, radioTru, radioNhan, radioChia;
    double soA, soB, ketQua;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtSoA.setEditable(true);
        txtSoB.setEditable(true);
        txtKQ.setEditable(false);
    }

    public void tinh(ActionEvent event) {
        soA = Double.parseDouble(txtSoA.getText());
        soB = Double.parseDouble(txtSoB.getText());
        if (radioCong.isSelected()) {
            ketQua = soA + soB;
        } else if (radioTru.isSelected()) {
            ketQua = soA - soB;
        } else if (radioNhan.isSelected()) {
            ketQua = soA * soB;
        } else if (radioChia.isSelected()) {
            if (soB != 0) {
                ketQua = soA / soB;
            } else {
                txtKQ.setText("Số B phải khác 0");
                return;
            }
        }

        txtKQ.setText(String.valueOf(ketQua));
    }


}