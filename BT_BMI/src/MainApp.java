import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// Khai báo các biến cần thiết
		float height, weight, BMI;
		
		// Nhập chiều cao và cân nặng
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập vào chiều cao của bạn(m): ");
		height = nhap.nextFloat();
		System.out.print("Nhập vào cân nặng của bạn(kg): ");
		weight = nhap.nextFloat();
		
		// Tính chỉ số BMI
		BMI = weight / (height*height);
		
		// Kiểm tra chỉ số BMI cho người Châu Á
		if (BMI > 0) {
			if (BMI < 18.5) {
				System.out.print("Bạn đang thiếu cân");
			}
			else if (BMI <= 22.9){
				System.out.print("Bạn bình thường");
			}
			else if (BMI <= 24.9) {
				System.out.print("Bạn đang thừa cân");
			}
			else {
				System.out.print("Bạn đang béo phì");
			}
		}
	}
}
