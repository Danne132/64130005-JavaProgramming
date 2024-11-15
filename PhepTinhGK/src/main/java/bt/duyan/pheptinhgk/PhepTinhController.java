package bt.duyan.pheptinhgk;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.security.Key;

public class PhepTinhController {
    @FXML
    TextField txtSoThuNhat, txtSoThuHai, txtKetQua;
    double soA, soB, ketQua;

    void initial(){
        soA = Double.parseDouble(txtSoThuNhat.getText());
        soB = Double.parseDouble(txtSoThuHai.getText());
        txtSoThuNhat.setEditable(true);
        txtSoThuHai.setEditable(true);
    }

    public void Cong(ActionEvent e){
        initial();
        ketQua = soA + soB;
        txtKetQua.setText(String.valueOf(ketQua));
    }

    public void Tru(ActionEvent e){
        initial();
        ketQua = soA - soB;
        txtKetQua.setText(String.valueOf(ketQua));
    }

    public void Nhan(ActionEvent e){
        initial();
        ketQua = soA * soB;
        txtKetQua.setText(String.valueOf(ketQua));
    }

    public void Chia(ActionEvent e){
        initial();
        if(soB == 0)
            txtKetQua.setText("ERROR");
        else{
            ketQua = soA/soB;
            txtKetQua.setText(String.valueOf(ketQua));
        }
    }

    public void Can(ActionEvent e){
        initial();
        if(soB == 0)
            txtKetQua.setText("ERROR");
        else {
            ketQua = Math.pow(soA, 1 / soB);
            txtKetQua.setText(String.valueOf(ketQua));
        }
    }

    public void Sin(ActionEvent e){
        initial();
        txtSoThuHai.setEditable(false);
        ketQua = Math.sin(soA);
        txtKetQua.setText(String.valueOf(ketQua));
    }

    public void Cos(ActionEvent e){
        initial();
        txtSoThuHai.setEditable(false);
        ketQua = Math.cos(soA);
        txtKetQua.setText(String.valueOf(ketQua));
    }

    public void Log(ActionEvent e){
        initial();
        txtSoThuHai.setEditable(false);
        ketQua = Math.log(soA);
        txtKetQua.setText(String.valueOf(ketQua));
    }
}
