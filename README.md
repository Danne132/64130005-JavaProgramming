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

#### 1. Bài tập kết nối database và up lên tableview
- Sử dụng MySQL để tạo database
- Lệnh kết nối và sử dụng database lên tableview
  ```
  void getData(){
        data = FXCollections.observableArrayList();
        //Lấy dữ liệu từ bảng sanpham trong database
        String sqlSelect = "select * from sanpham";
        Statement lenh  = null;
        try {
            lenh = conn.createStatement();
            ResultSet ketQua = lenh.executeQuery(sqlSelect);
            while(ketQua.next()){
                //lưu các sản phẩm được lấy từ database
                data.add(new SanPham(ketQua.getInt("Id"), ketQua.getNString("TenSP"), ketQua.getNString("MoTa"), ketQua.getDouble("GiaSP")));
            }
            //
            tableView.setItems(data);

        } catch (SQLException e) {
            System.out.println("Lỗi");
        }
    }
  ```
- Ngoài ra chương trình còn có chức năng thêm dữ liệu
- Kết quả bài tập:
![image](https://github.com/user-attachments/assets/1eefc647-586d-4a94-bb17-e4cb021705ea)

***
