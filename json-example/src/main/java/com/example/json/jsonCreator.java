package com.example.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

// Định nghĩa lớp MyObject
class Student {
    private String name;
    private int age;

    public Student() {}

    public Student(String name, int age) {
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

public class jsonCreator {
    public static void main(String[] args) {
        Student obj = new Student("Hoàng Duy An", 20);
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        try {
            mapper.writeValue(new File("output.json"), obj);
            System.out.println("File JSON đã được tạo thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
