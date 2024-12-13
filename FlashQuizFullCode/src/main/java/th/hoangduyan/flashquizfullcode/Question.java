package th.hoangduyan.flashquizfullcode;

import java.util.List;

public class Question {
    String question, correctAnswer, imgPath;
    List<String> answers;

    public Question(String question, String correctAnswer, List<String> answers, String imgPath) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = answers;
        this.imgPath = imgPath;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
