import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class App3Net {
	public static void main(String[] args) throws IOException {
		//Tạo chuỗi định vị tài nguyên xong, đến trang default.a
		URL url = new URL("https://ntu.edu.vn/default.aspx");
		//Gửi yêu cầu đến kêt snoois
		//Giống như chúng ta nhập url lên trình duyệt, rồi Google
		URLConnection connection = url.openConnection();
		InputStream in = connection.getInputStream();
		
		// Xử lý luồng, đọc dữ liệu, phần này độc lập
		InputStreamReader ir = new InputStreamReader(in);
		BufferedReader bufRead = new BufferedReader(ir);
		String line;
		while (true)
		{
			line = bufRead.readLine();
			if (line==null) break;
			System.out.println(line);
		}
	}
}
