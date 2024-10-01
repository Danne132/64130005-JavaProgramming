import java.io.FileReader;
import java.io.IOException;

public class App1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fReader = new FileReader("songque.txt");
		char buff[] = null;
		buff = new char[10];
		fReader.read(buff);
		// Cách 1: in từng ký tự
		for(int i = 0; i <10; i++)
			System.out.print(buff[i]);
		
		// Cách 2: chuyển thành chuỗi ký tự rồi in ra
		System.out.println(String.valueOf(buff));
	}

}
