# JAVA PROGRAMING
## HOÀNG DUY AN
### My profile:
* **🗓 Date of Birth**: 13/10/2004
* **🧑 Gender**       : male
* **🏤 Study at**     : Nha Trang University
* **💻 Falcuty**      : Information Technology
### Contact:
* [D AN Hoàng](https://www.facebook.com/hoangduyan2004)
## Kết quả một số bài tập đã làm
#### 1. Bài tập BMI
- Kết quả bài tập:
![image](https://github.com/user-attachments/assets/790238aa-1130-40e1-bc68-47620d654c45)

#### 1. Bài tập kết nối database
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





***
