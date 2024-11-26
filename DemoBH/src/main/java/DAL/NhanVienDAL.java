package DAL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Model_DTO.NhanVien;
import Utils.DBUtils;

public class NhanVienDAL {
	public boolean AddNew(NhanVien nv) {
	
		return true;
	}
	public boolean Delete(NhanVien nv) {
		return true;
	}
	public boolean Login(String id, String pass) throws SQLException {
		Connection connection = DBUtils.openConnection();
		String sqlSelect = "SELECT * FROM account";
		Statement lenh = connection.createStatement();
		ResultSet ketQua = lenh.executeQuery(sqlSelect);
		while(ketQua.next()) {
			if(ketQua.getString("tentk").equals(id) && ketQua.getString("mkhau").equals(pass)) {
				return true;
			}
		}
		return false;
	}

}
