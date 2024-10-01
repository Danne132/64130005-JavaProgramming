import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		FileWriter fWriter;
		fWriter = new FileWriter("songque.txt");
		fWriter.write("Sông quê là con sông quê \n");
		fWriter.write("Quê là quê quá, quê là quê ghê...");
		
		fWriter.flush();
		fWriter.close();
	}

}
