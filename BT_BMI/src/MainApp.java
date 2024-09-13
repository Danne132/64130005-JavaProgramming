import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// Khai báo các biến cần thiết
		float height, weight, BMI;
		
		// Nhập chiều cao và cân nặng
		Scanner nhap = new Scanner(System.in);
		while(true){
			try {
				System.out.print("Nhập vào chiều cao của bạn(m): ");
				height = nhap.nextFloat();
				if(height >= 1f && height <= 2.2f) {
					break;
				}
			} catch (Exception e) {
				System.out.println("Hãy nhập vào một số");
			}
		}
		
		while(true) {
			try {
				System.out.print("Nhập vào cân nặng của bạn(kg): ");
				weight = nhap.nextFloat();
				if(weight > 0 && weight <= 200) {
					break;
				}
			} catch (Exception e) {
				System.out.print("Hãy nhập vào một số");
			}
		}
		
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
