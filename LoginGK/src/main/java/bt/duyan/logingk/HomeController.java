package bt.duyan.logingk;

import bt.duyan.logingk.SanPham;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.w3c.dom.Text;

import java.sql.*;
import java.util.EventListener;

public class HomeController {
    @FXML
    TableView<SanPham> tableView;
    //Tạo ra các trường tương ứng
    @FXML
    TableColumn<SanPham, Integer> id;
    @FXML
    TableColumn<SanPham, String> tenSP;
    @FXML
    TableColumn<SanPham, Float> donGia;
    @FXML
    TextField txtTenSP, txtGiaSP;
    @FXML
    Button btnThemSP;
    //Cập nhật giao diện khi dữ liệu thay đổi
    private ObservableList<SanPham> data;
    Connection conn;

    public void initialize() {
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        tenSP.setCellValueFactory(new PropertyValueFactory<>("tenSP"));
        donGia.setCellValueFactory(new PropertyValueFactory<>("donGia"));
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
            System.out.println("Kết nối thất bại");
        }
    }

    void getData(){
        data = FXCollections.observableArrayList();
        //Lấy dữ liệu từ bảng sanpham trong database
        String sqlSelect = "select * from product";
        Statement lenh  = null;
        try {
            lenh = conn.createStatement();
            ResultSet ketQua = lenh.executeQuery(sqlSelect);
            while(ketQua.next()){
                //lưu các sản phẩm được lấy từ database
                data.add(new SanPham(ketQua.getInt("idSP"), ketQua.getNString("tenSP"), ketQua.getFloat("donGia")));
            }
            //
            tableView.setItems(data);

        } catch (SQLException e) {
            System.out.println("Lỗi");
        }
    }

//    @FXML
    public void addSP(ActionEvent event){
        String tenSP = String.valueOf(txtTenSP.getText());
        float giaSP;

        // Kiểm tra và chuyển đổi giá trị nhập liệu
        try {
            giaSP = Float.parseFloat(txtGiaSP.getText());
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Giá sản phẩm không hợp lệ!");
            return;
        }

        // Tạo đối tượng sản phẩm mới
        SanPham sp = new SanPham();
        sp.setTenSP(tenSP);
        sp.setDonGia(giaSP);

        // Câu lệnh SQL thêm dữ liệu vào bảng
        String sqlInsert = "INSERT INTO `product`(`tenSP`, `donGia`) VALUES (?,?)";

        PreparedStatement statement = null;

        try {
            // Kiểm tra kết nối
            if (conn == null || conn.isClosed()) {
                System.out.println("Lỗi: Kết nối cơ sở dữ liệu không thành công.");
                return;
            }

            // Tạo PreparedStatement và gán giá trị
            statement = conn.prepareStatement(sqlInsert);
            statement.setString(1, tenSP);
            statement.setFloat(2, giaSP);

            // Thực hiện câu lệnh thêm dữ liệu
            int rowsInserted = statement.executeUpdate();  // Thực thi câu lệnh

            // Kiểm tra xem có bao nhiêu hàng bị ảnh hưởng
            if (rowsInserted > 0) {
                System.out.println("Thêm sản phẩm thành công");
            } else {
                System.out.println("Không thể thêm sản phẩm.");
            }

            // Lấy dữ liệu mới từ database và cập nhật TableView
            getData();

        } catch (SQLException e) {
            System.out.println("Lỗi khi thêm sản phẩm");
            e.printStackTrace();
        } finally {
            // Đóng PreparedStatement
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
