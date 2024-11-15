package thi.duyan.bai3;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.Duration;

import java.util.*;

public class HelloController {
    @FXML
    TextField txtPoint, txtTime, txtA, txtB, txtPT;
    @FXML
    Button btn1, btn2, btn3, btn4, btnAsk;
    static int point;
    int a, b;
    ArrayList<Button> btns;
    Timeline countdownTimeLine;
    int countdownTime;

    public void initialize(){
        btns = new ArrayList<>(Arrays.asList(btn1, btn2, btn3, btn4));
        point = 0;
    }

    void setPoint(){
        point = point + 1;
        txtPoint.setText(String.valueOf(point));
    }

    public void ask() {
        countdownTime = 5;
        List<String> pheptinh = new ArrayList<>(Arrays.asList("+", "-", "x"));
        Random rd = new Random();
        int randomIndex = rd.nextInt(pheptinh.size());
        String randomElement = pheptinh.get(randomIndex);
        String phepTinh = randomElement;
        txtPT.setText(phepTinh);

        // Tạo hai số ngẫu nhiên a và b
        int a = rd.nextInt(10);
        int b = rd.nextInt(10);
        txtA.setText(String.valueOf(a));
        txtB.setText(String.valueOf(b));

        // Tính toán câu trả lời đúng
        int answer = tinhToan(phepTinh, a, b);
        List<Integer> answers = new ArrayList<>();
        answers.add(answer);

        // Tạo danh sách các câu trả lời ngẫu nhiên
        Set<Integer> uniqueAnswers = new HashSet<>(answers); // Sử dụng Set để đảm bảo tính duy nhất
        while (uniqueAnswers.size() < 4) {
            int randomNum = rd.nextInt(100); // Sinh ra số ngẫu nhiên từ 0 đến 99
            uniqueAnswers.add(randomNum); // Thêm số vào Set, tự động loại bỏ trùng lặp
        }

        // Chuyển đổi Set thành List
        answers.clear();
        answers.addAll(uniqueAnswers);

        // Chọn 4 câu trả lời
        Collections.shuffle(answers); // Xáo trộn danh sách câu trả lời
        btn1.setText(String.valueOf(answers.get(0)));
        btn2.setText(String.valueOf(answers.get(1)));
        btn3.setText(String.valueOf(answers.get(2)));
        btn4.setText(String.valueOf(answers.get(3)));
        for(var btn:btns){
            check(btn, answer);
        }

        if (countdownTimeLine!= null) {
            countdownTimeLine.stop();
        }
        countdownTimeLine = new Timeline(
                new KeyFrame(Duration.seconds(1), event -> {
                    countdownTime--;
                    txtTime.setText(String.valueOf(countdownTime)); // Cập nhật thời gian trên giao diện

                    if (countdownTime <= 0) {
                        countdownTimeLine.stop();
                        for(var btn:btns){
                            btn.setDisable(true);
                        }
                    }
                })
        );
        countdownTimeLine.setCycleCount(5); // Chạy 5 lần, mỗi lần 1 giây
        countdownTimeLine.play();
    }


    int tinhToan(String phepTinh, int a, int b){
        switch (phepTinh){
            case "+" -> {
                return a+b;
            }
            case "-" -> {
                return a-b;
            }
            case "x" -> {
                return a*b;
            }
            default -> {
                return 0;
            }
        }
    }

    public void check(Button btn, int answer){
        btn.setOnMouseClicked(mouseEvent -> {
            if (Integer.parseInt(btn.getText()) == answer) {
                setPoint();
                ask();
            }
            else
                ask();
        });
    }




}