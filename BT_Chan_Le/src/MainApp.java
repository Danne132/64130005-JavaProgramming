import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// Tạo biến số để kiểm tra
		int a;
		
		// Nhập số a từ bàn phím
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập một số để kiểm tra chẵn lẻ: ");
		a = nhap.nextInt();
		
		// Kiểm tra a là chãn hay lẻ
		// Nếu a chia hết cho 2 thì a là số chẵn
		if (a % 2 == 0) {
			System.out.print(a + " là số chãn");
		} else {
			System.out.print(a + " là số lẻ");
		}
	}

}
