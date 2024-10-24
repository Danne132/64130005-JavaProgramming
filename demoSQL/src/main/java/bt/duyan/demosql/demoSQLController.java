package bt.duyan.demosql;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.sql.*;

public class demoSQLController {
    @FXML
    TableView<SanPham> tableView;
    //Tạo ra các trường tương ứng
    TableColumn<SanPham, Integer> id;
    TableColumn<SanPham, String> tenSP;
    TableColumn<SanPham, Double> donGia;
    TableColumn<SanPham, String> moTa;
    //Cập nhật giao diện khi dữ liệu thay đổi
    private ObservableList<SanPham> data;
    Connection conn;

    // Kết nối database
    void connectDTB(){
        //Nhập vào đường dẫn của database
        String url = "jdbc:mysql://localhost:3306/demo";
        try {
            conn = DriverManager.getConnection(url, "root", "");
            System.out.println("Kết nối thành công");
        } catch (SQLException e) {
            System.out.println("Kết nối thất bại");
        }
    }

    void getData(){
        //Lấy dữ liệu từ bảng sanpham trong database
        String sqlSelect = "select * from sanpham";
        Statement lenh  = null;
        try {
            lenh = conn.createStatement();
            ResultSet ketQua = lenh.executeQuery(sqlSelect);
            while(ketQua.next()) {
            }

        } catch (SQLException e) {
            System.out.println("Lỗi");
        }

    }

}
