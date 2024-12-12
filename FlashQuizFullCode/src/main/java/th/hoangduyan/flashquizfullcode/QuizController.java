package th.hoangduyan.flashquizfullcode;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class QuizController implements Initializable {
    @FXML
    Button btnC1, btnC2, btnC3, btnC4, btnC5, btnC6, btnC7, btnC8, btnC9, btnC10;
    @FXML
    Button btnA, btnB, btnC, btnD, btnaA, btnaB, btnaC, btnaD;
    @FXML
    TextArea questionBoard;
    @FXML
    TextField point;
    List<Button> btnsQ;
    List<Button> btnAnswerLetter;
    List<Button> btnAnswer;
    List<Question> questions;
    int score = 0;
    int currentQuestion = 0;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnsQ =new ArrayList<>(Arrays.asList(btnC1, btnC2, btnC3, btnC4, btnC5, btnC6, btnC7, btnC8, btnC9, btnC10));
        btnAnswerLetter = new ArrayList<>(Arrays.asList(btnA, btnB, btnC, btnD));
        btnAnswer = new ArrayList<>(Arrays.asList(btnaA, btnaB, btnaC, btnaD));
        point.setDisable(true);
        initialQuestion();
        setupButtonQuestion();
        setupButtonAnswer();
    }

    private void setupButtonQuestion(){
        for(int i = 0; i < btnsQ.size(); i++){
            int finalI = i;
            btnsQ.get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    resetButtonAnserColor();
                    resetButtonQuestionColors();
                    btnsQ.get(finalI).setDisable(false);
                    btnsQ.get(finalI).setStyle("-fx-background-color: #F46C00; -fx-background-radius: 10px;");
                    questionBoard.setText(questions.get(finalI).getQuestion());
                    getAnswer(finalI);
                    currentQuestion = finalI;
                }
            });
        }
    }

    private void setupButtonAnswer(){
        for(int i = 0; i < btnAnswer.size(); i++){
            int finalI = i;
            btnAnswer.get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    resetButtonAnserColor();
                    if(checkAnswer(finalI)){
                        btnAnswer.get(finalI).setStyle("-fx-background-color: #afef8f; -fx-background-radius: 10px;");
                        btnAnswerLetter.get(finalI).setStyle("-fx-background-color:#afef8f; -fx-background-radius: 100%; -fx-pref-width: 60px; -fx-pref-height: 60px");
                        score++;
                        point.setText(String.valueOf(score));
                    }else{
                        btnAnswer.get(finalI).setStyle("-fx-background-color: #f34624; -fx-background-radius: 10px;");
                        btnAnswerLetter.get(finalI).setStyle("-fx-background-color: #f34624; -fx-background-radius: 100%; -fx-pref-width: 60px; -fx-pref-height: 60px");
                    }
                    btnsQ.get(currentQuestion).setDisable(true);
                }
            });
        }
    }
    private void initialQuestion(){
        questions = new ArrayList<>(Arrays.asList(
                new Question("What is the size of an int in Java?", "4 bytes", Arrays.asList("1 byte", "2 bytes", "4 bytes", "8 bytes")),
                new Question("Which operator is used to allocate memory dynamically in C++?", "new", Arrays.asList("malloc", "new", "alloc", "allocate")),
                new Question("What is the default return type of the main function in C++?", "int", Arrays.asList("void", "int", "float", "double")),
                new Question("How are blocks defined in Python?", "Indentation", Arrays.asList("Curly braces", "Parentheses", "Indentation", "Semicolon")),
                new Question("What is the default value of a boolean in Java?", "false", Arrays.asList("true", "false", "null", "0")),
                new Question("Which method is used to start a thread in Java?", "start()", Arrays.asList("run()", "start()", "execute()", "init()")),
                new Question("Which keyword is used to inherit a class in Java?", "extends", Arrays.asList("extends", "implements", "inherit", "base")),
                new Question("What does JVM stand for?", "Java Virtual Machine", Arrays.asList("Java Version Manager", "Java Virtual Machine", "Java Visual Model", "Java Variable Manager")),
                new Question("What is the output of `sizeof(char)` in C++?", "1", Arrays.asList("1", "2", "4", "8")),
                new Question("Which of these is a mutable data type in Python?", "list", Arrays.asList("tuple", "str", "list", "int"))
        ));
    }

    private void getAnswer(int index){
        for(int i = 0; i < btnAnswer.size(); i++){
            btnAnswer.get(i).setText(questions.get(index).getAnswers().get(i));
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

    private boolean checkAnswer(int index){
        if(btnAnswer.get(index).getText() == questions.get(currentQuestion).getCorrectAnswer())
            return true;
        return false;
    }
}