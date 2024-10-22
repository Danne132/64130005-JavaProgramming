package com.example.caro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class CaroController implements Initializable {

    @FXML
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    @FXML
    private Label txtThongBao;
    private int player_turn = 0;

    private ArrayList<Button> btns;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        btns = new ArrayList<>(Arrays.asList(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9));
        for(var btn : btns){
            setupBtn(btn);
            btn.setFocusTraversable(false);
        }
    }
    @FXML
    private void setupBtn(Button btn){
        btn.setOnMouseClicked(mouseEvent -> {
            setPlayerSymbol(btn);
            btn.setDisable(true);
            checkGameover();
        });
    }

    void setPlayerSymbol(Button btn){
        if(player_turn % 2 == 0){
            btn.setText("X");
            player_turn = 1;
        }
        else{
            btn.setText("O");
            player_turn = 0;
        }
    }

    void stop(){
        for(var btn:btns){
            btn.setDisable(true);
        }
    }

    void checkGameover(){
        for(int i = 0; i < 8; i++){
            String line = switch (i){
                case 0 -> btn1.getText() + btn2.getText() + btn3.getText();
                case 1 -> btn4.getText() + btn5.getText() + btn6.getText();
                case 2 -> btn7.getText() + btn8.getText() + btn9.getText();
                case 3 -> btn1.getText() + btn4.getText() + btn7.getText();
                case 4 -> btn2.getText() + btn5.getText() + btn8.getText();
                case 5 -> btn3.getText() + btn6.getText() + btn9.getText();
                case 6 -> btn1.getText() + btn5.getText() + btn9.getText();
                case 7 -> btn7.getText() + btn5.getText() + btn3.getText();
                default -> null;
            };

            if(line.equals("XXX")){
                txtThongBao.setText("X thắng");
                stop();
            } else if (line.equals("OOO")) {
                txtThongBao.setText("O thắng");
                stop();
            }
        }
    }
}
