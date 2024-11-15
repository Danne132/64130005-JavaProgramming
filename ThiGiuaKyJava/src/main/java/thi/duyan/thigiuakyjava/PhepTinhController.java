package thi.duyan.thigiuakyjava;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import netscape.javascript.JSObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.Key;

public class PhepTinhController {
    @FXML
    TextField txtSoThuNhat, txtSoThuHai, txtKetQua;
    @FXML
    TextArea txtLichSu;
    double soA, soB, ketQua;
    JSONArray phepTinhList = new JSONArray();


    public void initial(){
        soA = Double.parseDouble(txtSoThuNhat.getText());
        soB = Double.parseDouble(txtSoThuHai.getText());
        txtSoThuNhat.setEditable(true);
        txtSoThuHai.setEditable(true);
    }

    public void Cong(ActionEvent e){
        initial();
        ketQua = soA + soB;
        JSONObject pheptinh = new JSONObject();
        pheptinh.put("pt", soA+"+"+soB+"="+ketQua);
        txtKetQua.setText(String.valueOf(ketQua));
        phepTinhList.add(pheptinh);
        SaveInfor();
        LoadInfor();
    }

    public void Tru(ActionEvent e){
        initial();
        ketQua = soA - soB;
        JSONObject pheptinh = new JSONObject();
        pheptinh.put("pt", soA+"-"+soB+"="+ketQua);
        txtKetQua.setText(String.valueOf(ketQua));
        phepTinhList.add(pheptinh);
        SaveInfor();
        LoadInfor();
    }

    public void Nhan(ActionEvent e){
        initial();
        ketQua = soA * soB;
        JSONObject pheptinh = new JSONObject();
        pheptinh.put("pt", soA+"x"+soB+"="+ketQua);
        txtKetQua.setText(String.valueOf(ketQua));
        phepTinhList.add(pheptinh);
        SaveInfor();
        LoadInfor();
    }

    public void Chia(ActionEvent e){
        initial();
        if(soB == 0)
            txtKetQua.setText("ERROR");
        else{
            ketQua = soA / soB;

            JSONObject pheptinh = new JSONObject();

            pheptinh.put("pt", soA+"/"+soB+"="+ketQua);
            phepTinhList.add(pheptinh);
            txtKetQua.setText(String.valueOf(ketQua));
            SaveInfor();
            LoadInfor();
        }

    }

    public void Mod(ActionEvent e){
        initial();
        if(soB == 0)
            txtKetQua.setText("ERROR");
        else{
            ketQua = soA % soB;
            JSONObject pheptinh = new JSONObject();
            pheptinh.put("pt", soA+"mod"+soB+"="+ketQua);
            txtKetQua.setText(String.valueOf(ketQua));
            phepTinhList.add(pheptinh);
            SaveInfor();
            LoadInfor();
        }

    }

    public void Div(ActionEvent e){
        initial();
        if(soB == 0)
            txtKetQua.setText("ERROR");
        else{
            ketQua = soA / soB;
            int changeKQ = (int) Math.floor(ketQua);
            JSONObject pheptinh = new JSONObject();
            pheptinh.put("pt", soA+"div"+soB+"="+changeKQ);
            txtKetQua.setText(String.valueOf(changeKQ));
            phepTinhList.add(pheptinh);
            SaveInfor();
            LoadInfor();
        }

    }

    public void SaveInfor(){
        try{
            FileWriter writer = new FileWriter("pheptinh.json");
            writer.write(phepTinhList.toJSONString());
            writer.flush();
            System.out.println("Lưu file JSON đã thành công!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void LoadInfor(){
        try {
            // Tải file FXML
            FXMLLoader loader = new FXMLLoader(ViewSwitcher.class.getResource(fxmlFile));
            Parent root = loader.load();

            // Tạo scene mới
            Scene scene = new Scene(root);

            // Thay đổi scene của cửa sổ hiện tại
            .setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
