import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// Khai báo các biến cần thiết
		int a, b, tong;
		
		// Chuẩn bị nhập dữ liệu
		Scanner nhap = new Scanner(System.in);
		
		// Nhập dữ liệu
		System.out.println("CÔNG THỨC TÍNH TỔNG 2 SỐ NGUYÊN----------");
		
		System.out.print("a = ");
		// Đợi user nhập, lấy dữ liệu và cất và biến a
		a = nhap.nextInt();
		
		System.out.print("b = ");
		// Đợi user nhập, lấy dữ liệu và cất và biến b
		b = nhap.nextInt();
		
		// Tính tổng
		tong = a + b;
		
		// Xuất kết quả
		System.out.print("Tổng là " + tong);
	}// Kết thúc tính toán
}// Kết thúc class
