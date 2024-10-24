package bt.duyan.demosql;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class demoSQLController {
    @FXML
    TableView<SanPham> tableView;

    // Kết nối database
    void connectDTB(){
        //Nhập vào đường dẫn của database
        String url = "jdbc:mysql://localhost:3306/demo";
        try {
            Connection conn = DriverManager.getConnection(url, "root", "");
            System.out.println("Kết nối thành công");
        } catch (SQLException e) {
            System.out.println("Kết nối thất bại");
        }
    }



}
