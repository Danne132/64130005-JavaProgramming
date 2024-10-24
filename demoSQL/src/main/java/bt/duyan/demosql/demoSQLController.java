package bt.duyan.demosql;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.*;

public class demoSQLController {
    @FXML
    TableView<SanPham> tableView;
    //Tạo ra các trường tương ứng
    @FXML
    TableColumn<SanPham, Integer> id;
    @FXML
    TableColumn<SanPham, String> tenSP;
    @FXML
    TableColumn<SanPham, Double> donGia;
    @FXML
    TableColumn<SanPham, String> moTa;
    //Cập nhật giao diện khi dữ liệu thay đổi
    private ObservableList<SanPham> data;
    Connection conn;

    public void initialize() {
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        tenSP.setCellValueFactory(new PropertyValueFactory<>("tenSP"));
        donGia.setCellValueFactory(new PropertyValueFactory<>("donGia"));
        moTa.setCellValueFactory(new PropertyValueFactory<>("moTa"));
        connectDTB();
        getData();
    }

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
        data = FXCollections.observableArrayList();
        connectDTB();
        //Lấy dữ liệu từ bảng sanpham trong database
        String sqlSelect = "select * from sanpham";
        Statement lenh  = null;
        try {
            lenh = conn.createStatement();
            ResultSet ketQua = lenh.executeQuery(sqlSelect);
            while(ketQua.next()){
                //lưu các sản phẩm được lấy từ database
                data.add(new SanPham(ketQua.getInt("Id"), ketQua.getNString("TenSP"), ketQua.getNString("MoTa"), ketQua.getDouble("GiaSP")));
            }
            //
            tableView.setItems(data);

        } catch (SQLException e) {
            System.out.println("Lỗi");
        }

    }

}
