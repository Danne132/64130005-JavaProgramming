package bt.duyan.demobanhang;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        launch();
        // Đăng ký diver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Mở kết nối
        // 2.1 Chuỗi két nối
        String strCont = "jdbc:mysql://localhost:3306/demo";

        // 2.2 Mở kết nối
        Connection conn = DriverManager.getConnection(strCont,"root","");
//        System.out.printf("Haha");

        // Select
        String sqlSelect = "select * from sanpham";
        Statement lenh  = conn.createStatement();
        ResultSet ketQua = lenh.executeQuery(sqlSelect);

        //Hiện kết quả
        while (ketQua.next()){
            int id = ketQua.getInt(1); //Lấy dữ liệu từ cột 0
            String tenSP = ketQua.getString(2);
            String giaSP = ketQua.getString(3);
            String moTa = ketQua.getString(4);
            System.out.println(id+ " | " + tenSP + " | " + giaSP + " | " + moTa);
        }
    }
}