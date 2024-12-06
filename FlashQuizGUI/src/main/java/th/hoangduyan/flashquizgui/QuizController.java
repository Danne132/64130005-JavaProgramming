package th.hoangduyan.flashquizgui;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class QuizController implements Initializable {
    @FXML
    Button btnC1, btnC2, btnC3, btnC4, btnC5, btnC6, btnC7, btnC8, btnC9, btnC10;
    List<Button> bnsQ;
    @FXML
    Button btnA, btnB, btnC, btnD, btnaA, btnaB, btnaC, btnaD;
    List<Button> bnsA;
    @FXML
    GridPane answerGrid;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bnsQ = new ArrayList<>(Arrays.asList(btnC1, btnC2, btnC3, btnC4, btnC5, btnC6, btnC7, btnC8, btnC9, btnC10));
        addButtonAnswerEventHandlers();;
        for(Button btn : bnsQ){

            btn.setOnMouseClicked(new EventHandler<MouseEvent>() {

                @Override
                public void handle(MouseEvent mouseEvent) {
                    resetButtonQuestionColors();
                    btn.setStyle("-fx-background-color: #F46C00; -fx-background-radius: 10px;");
                }
            });
        }
    }
    private void resetButtonQuestionColors() {
        for (Button btn : bnsQ) {
            btn.setStyle("-fx-background-color: #FF9415; -fx-background-radius: 10px;"); // Màu mặc định
        }
    }
    private void addButtonAnswerEventHandlers() {
        for (Node node : answerGrid.getChildren()) {
            if (node instanceof Button) {
                Button button = (Button) node;
                button.setOnAction(event -> changeButtonAnswerColor(button));
            }
        }
    }

    private void changeButtonAnswerColor(Button clickedButton) {
        resetButtonQuestionColors();
        Integer rowIndex = GridPane.getRowIndex(clickedButton);

        if (rowIndex == null) {
            rowIndex = 0;
        }

        for (Node node : answerGrid.getChildren()) {
            if (node instanceof Button) {
                Integer currentRowIndex = GridPane.getRowIndex(node);

                if (currentRowIndex == null) {
                    currentRowIndex = 0;
                }
                if (currentRowIndex.equals(rowIndex)) {
                    Button button = (Button) node;
                    button.setStyle("-fx-background-color: #FF0000; -fx-background-radius: 100%;");
                }
            }
        }
    }

}