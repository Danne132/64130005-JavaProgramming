package th.hoangduyan.flashquizfullcode;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class QuizController implements Initializable {
    @FXML
    Button btnC1, btnC2, btnC3, btnC4, btnC5, btnC6, btnC7, btnC8, btnC9, btnC10;
    List<Button> btnsQ;
    @FXML
    Button btnA, btnB, btnC, btnD, btnaA, btnaB, btnaC, btnaD;
    List<Button> btnAnswerLetter;
    List<Button> btnAnswer;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnsQ =new ArrayList<>(Arrays.asList(btnC1, btnC2, btnC3, btnC4, btnC5, btnC6, btnC7, btnC8, btnC9, btnC10));
        btnAnswerLetter = new ArrayList<>(Arrays.asList(btnA, btnB, btnC, btnD));
        btnAnswer = new ArrayList<>(Arrays.asList(btnaA, btnaB, btnaC, btnaD));
        for(Button btn : btnsQ){
            btn.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    resetButtonAnserColor();
                    resetButtonQuestionColors();
                    btn.setStyle("-fx-background-color: #F46C00; -fx-background-radius: 10px;");
                }
            });
        }
        for(int i = 0; i < btnAnswer.size(); i++){
            int finalI = i;
            btnAnswer.get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    resetButtonAnserColor();
                    btnAnswer.get(finalI).setStyle("-fx-background-color: #F46C00; -fx-background-radius: 10px;");
                    btnAnswerLetter.get(finalI).setStyle("-fx-background-color:#F46C00; -fx-background-radius: 100%; -fx-pref-width: 60px; -fx-pref-height: 60px");
                }
            });
        }
    }

    private void resetButtonQuestionColors() {
        for (Button btn : btnsQ) {
            btn.setStyle("-fx-background-color: #FF9415; -fx-background-radius: 10px;"); // Màu mặc định
        }
    }

    private void resetButtonAnserColor(){
        for(int i = 0; i < btnAnswerLetter.size(); i++){
            btnAnswer.get(i).setStyle("-fx-background-color: #FF9415; -fx-background-radius: 10px;");
            btnAnswerLetter.get(i).setStyle("-fx-background-color:#FF9415; -fx-background-radius: 100%; -fx-pref-width: 60px; -fx-pref-height: 60px");
        }
    }
}