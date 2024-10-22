package bt.duyan.demobanhang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Home {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Mở kết nối
        // 2.1 Chuỗi két nối
        String strCont = "jdbc:mysql://localhost:3306/demo";
        Connection conn = DriverManager.getConnection(strCont,"root","");
        System.out.printf("Haha");
    }
}
