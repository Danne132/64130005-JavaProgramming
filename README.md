# JAVA PROGRAMING
## HOÀNG DUY AN

### My profile:
![bc638a35af294c58d456cd6f9280b00c](https://github.com/user-attachments/assets/56320d47-38af-4104-a82d-afc83df14327)
* **🗓 Date of Birth**: 13/10/2004
* **🧑 Gender**       : male
* **🏤 Study at**     : Nha Trang University
* **💻 Falcuty**      : Information Technology
### Contact:
* [D AN Hoàng](https://www.facebook.com/hoangduyan2004)
## Kết quả một số bài tập đã làm
### Bài tập kết nối database
- Sử dụng MySQL để tạo database
- Lệnh kết nối và sử dụng database
  ```
  public static Connection openConnection() {
	    Connection con = null;
	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      String connectionURL = "jdbc:mysql://localhost:3306/banhang";
	      con = DriverManager.getConnection(connectionURL, "root", "");
	      System.out.println("Connection successful!");
	    } catch (ClassNotFoundException e) {
	      System.out.println("MySQL Driver not found!");
	      e.printStackTrace();
	    } catch (SQLException e) {
	      System.out.println("Connection failed!");
	      e.printStackTrace();
	    }
	    return con;
  }
  ```
- Ngoài ra chương trình còn có chức năng thêm dữ liệu
- Kết quả bài tập:
![image](https://github.com/user-attachments/assets/1eefc647-586d-4a94-bb17-e4cb021705ea)

### Bài tập JSON dùng thư viện GSON
- ✍ Code chương trình
```
FileWriter writer = new FileWriter("output_gson.json");
try {
	gson.toJson(obj, writer);
	System.out.println("File JSON đã được tạo thành công với Gson!");
	String jsonString = gson.toJson(obj);
	System.out.println("Chuỗi JSON: ");
	System.out.println(jsonString);
} finally {
	if (writer != null) {
		 writer.close();
	}
}
```
### Bài tập RSS
- ✍ Code chương trình
```
String feedUrl = "https://vnexpress.net/rss/tin-moi-nhat.rss";
URI uri = new URI(feedUrl);
URL url = uri.toURL();
XmlReader reader = new XmlReader(url);
SyndFeed feed = (new SyndFeedInput()).build(reader);
System.out.println("Feed Title: " + feed.getTitle());
System.out.println("Feed Description: " + feed.getDescription());
System.out.println("-----------------------------------------------------");
List<SyndEntry> entries = feed.getEntries();
Iterator var8 = entries.iterator();
while(var8.hasNext()) {
	SyndEntry entry = (SyndEntry)var8.next();
	System.out.println("Title: " + entry.getTitle());
	System.out.println("Link: " + entry.getLink());
	System.out.println("Published Date: " + entry.getPublishedDate());
	System.out.println("-----------------------------------------------------");
}
```

### Bài tập từ điển: Bài tập này sử dụng Hashmap để thực hiện việc tìm kiếm từ cần dịch
|Kết quả chương trình|Dịch từ|Thêm từ dịch|
|:-------------------|:------|:-----------|
|![image](https://github.com/user-attachments/assets/c8576728-05ed-40cf-a602-30f7e9b69a01)|![image](https://github.com/user-attachments/assets/f166f714-7b76-48ea-afa8-134a27cdd5ab)|![image](https://github.com/user-attachments/assets/4d53c739-6626-4cc5-ae12-e789c9689f19)|

### Bài tập Quiz
|Kết quả chương trình|Khi trả lời sai|Khi trả lời hết|
|:-------------------|:--------------|:--------------|
|![image](https://github.com/user-attachments/assets/844f6420-c118-4db2-afd8-dd6993f7be29)|![image](https://github.com/user-attachments/assets/889afc0d-e63d-47cc-b344-132516fe7b71)|![image](https://github.com/user-attachments/assets/8019556c-d493-4db3-9bb4-eb5b6f91d273)|

### Bài tập BMI
|Kết quả chương trình|Kết quả chương trình|Kết quả chương trình|
|:-------------------|:-------------------|:-------------------|
|![image](https://github.com/user-attachments/assets/9f84c882-f9b9-42b4-be2f-c5bb9ec46523)|![image](https://github.com/user-attachments/assets/d22ea254-015a-4465-9729-27398e00da9d)|![image](https://github.com/user-attachments/assets/ad1c23d2-7729-4229-9568-7e8da175bef4)|

### Bài tập tính toán đơn giản
|Kết quả phép cộng|Kế quả phép trừ|Kết quả phép nhân|Kết quả phép chia|
:-----------------|:--------------|:----------------|:----------------|
|![image](https://github.com/user-attachments/assets/17cf1980-2ad1-4c73-bd29-629e4a615677)|![image](https://github.com/user-attachments/assets/91221aed-c400-46e3-806d-0a7c28c189eb)|![image](https://github.com/user-attachments/assets/c6e86c8c-38ee-43c1-9904-eb60706a5d78)|![image](https://github.com/user-attachments/assets/688e0646-22c0-4560-8b99-b1f20253956f)|









***
