import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("num.txt");
			for(int i = 0; i <127; i++)
				fout.write(i);
			fout.flush();
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File không tồn tại");
		}
		
		System.out.println("Done");
	}

}
