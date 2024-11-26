package BLL;

import java.sql.Connection;

import DAL.NhanVienDAL;
import Model_DTO.NhanVien;
import Utils.DBUtils;

public class NhanVienBLL {
	NhanVienDAL nhanVienDAL = new NhanVienDAL();
	boolean ThemMoi(NhanVien nv) {
		boolean kq = nhanVienDAL.AddNew(nv);
		return kq;
	}
	
	public boolean checkLogin(String tenDN, String matKhau) {
		//Kiểm tra tính đúng đắn
		Connection connection = DBUtils.openConnection(matKhau);
		
		//Vd: tên có rỗng không, có đúng format không
		//Nếu thỏa mãn thì gọi hàm dịch vụ ở tầng DAL
		return nhanVienDAL.Login(tenDN, matKhau);
	}
}
