import java.util.HashMap;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		HashMap<String, String> dicHashMap = new HashMap<String, String>();
		dicHashMap.put("hello", "xin chào");
        dicHashMap.put("goodbye", "tạm biệt");
        dicHashMap.put("thank you", "cảm ơn");
        dicHashMap.put("please", "làm ơn");
        dicHashMap.put("sorry", "xin lỗi");
        dicHashMap.put("yes", "vâng");
        dicHashMap.put("house", "nhà");
        dicHashMap.put("friend", "bạn bè");
        dicHashMap.put("hungry", "đói");
        dicHashMap.put("full", "đầy đủ");
		
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Engish word: "); 
        String translated_word = scanner.next();
        
        if(dicHashMap.containsKey(translated_word)) {
        	System.out.println("Dịch: " + dicHashMap.get(translated_word));
        }
	}

}
