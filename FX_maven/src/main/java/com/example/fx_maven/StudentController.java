package com.example.fx_maven;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StudentController {
    @FXML
    private TextField txtMSSV, txtName, txtYear;
    @FXML
    private TextArea txtaKQ;
    String MSSV, Name, Year;

    JSONArray studentList = new JSONArray();

    public void GetInfor(ActionEvent event){
        MSSV = String.valueOf(txtMSSV.getText());
        Name = String.valueOf(txtName.getText());
        Year = String.valueOf(txtYear.getText());
        JSONObject studentDetails = new JSONObject();
        studentDetails.put("MSSV", MSSV);
        studentDetails.put("Họ tên", Name);
        studentDetails.put("Năm sinh", Year);

        studentList.add(studentDetails);


        txtaKQ.appendText(studentDetails.toJSONString()+ "\n");
        txtMSSV.clear();
        txtName.clear();
        txtYear.clear();
    }

    public void SaveInfor(ActionEvent event){
        try{
            FileWriter writer = new FileWriter("student.json");
            writer.write(studentList.toJSONString());
            writer.flush();
            txtaKQ.setText("");
            System.out.println("Lưu file JSON đã thành công!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void LoadInfor(){
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("student.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray students = (JSONArray) obj;
            txtaKQ.setText(studentList.toJSONString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
