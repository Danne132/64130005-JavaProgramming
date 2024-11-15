package bt.duyan.logingk;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LoginController {
    @FXML
    TextField txtName, txtPass;
    @FXML
    Label lbThongBao;
    @FXML
    Button btnDN;
    Connection conn;
    String name, pass;
    List<Account> accs = new ArrayList<>();

    public void initialize(){
        connectDTB();
        getData();
    }

    // Kết nối database
    void connectDTB(){
        //Nhập vào đường dẫn của database
        String url = "jdbc:mysql://localhost:3306/gk";
        try {
            conn = DriverManager.getConnection(url, "root", "");
            System.out.println("Kết nối thành công");
        } catch (SQLException e) {
            throw new RuntimeException(e);
//            System.out.println("Kết nối thất bại");
        }
    }

    void getData(){
        String sqlSelect = "select * from account";
        Statement lenh  = null;
        try {
            lenh = conn.createStatement();
            ResultSet ketQua = lenh.executeQuery(sqlSelect);
            while(ketQua.next()){
                Account acc = new Account(ketQua.getString("name"), ketQua.getString("pass"));
                accs.add(acc);
                System.out.println(acc.getName() + "|" + acc.getPassword());
            }
        } catch (SQLException e) {
            System.out.println("Lỗi");
        }
    }

        public void Login(){
            name = String.valueOf(txtName.getText());
            pass = String.valueOf(txtPass.getText());
            Account acc = new Account(name, pass);
            boolean check = false;
            for(var acc1 : accs){
                if(acc1.getName().equals(acc.getName()) && acc1.getPassword().equals(acc.getPassword())) {
                    lbThongBao.setText("Đăng nhập thành công");
                    check = true;
                    switchScene();
                }
            }
            if(check == false){
                lbThongBao.setText("Đăng nhập thất bại");
            }
        }
    private void switchScene() {
        Stage stage;
        Scene scene;
        Parent root;

        // Tải FXML cho trang home
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("home.fxml"));
        try {
            root = fxmlLoader.load(); // Tải giao diện từ file home.fxml
            stage = (Stage) btnDN.getScene().getWindow(); // Lấy cửa sổ hiện tại
            scene = new Scene(root); // Tạo một scene mới với giao diện home.fxml
            stage.setScene(scene); // Đặt scene mới cho cửa sổ
            stage.setTitle("Danh Sách Sản Phẩm"); // Đặt tiêu đề cho cửa sổ
            stage.centerOnScreen(); // Căn giữa cửa sổ trên màn hình
            stage.show(); // Hiển thị cửa sổ
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
