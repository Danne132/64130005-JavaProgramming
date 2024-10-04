package com.example;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

class MyObject {
    private String name;
    private int age;

    // Constructors, getters và setters như trên
    public MyObject() {}

    public MyObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

    
}

public class jsonGson {
    public static void main(String[] args) {
        // Tạo đối tượng
        MyObject obj = new MyObject("Nguyen Van A", 25);

        // Tạo Gson với định dạng đẹp
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("output_gson.json")) {
            // Chuyển đổi đối tượng thành JSON và ghi vào file
            gson.toJson(obj, writer);
            System.out.println("File JSON đã được tạo thành công với Gson!");

            // Nếu muốn chuyển đổi đối tượng thành chuỗi JSON
            String jsonString = gson.toJson(obj);
            System.out.println("Chuỗi JSON: ");
            System.out.println(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
