package project.duyan.speechtotextvosk;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.vosk.LibVosk;
import org.vosk.LogLevel;
import org.vosk.Model;
import org.vosk.Recognizer;

import javax.sound.sampled.*;
import java.io.IOException;

public class HelloApplication extends Application {

    private boolean isRecording = false;
    private Recognizer recognizer;
    private TargetDataLine microphone;


    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
        // Khởi tạo mô hình Vosk
        LibVosk.setLogLevel(LogLevel.WARNINGS); // Tắt logging chi tiết
        String modelPath = "models/vosk-model-small-en-us-0.15"; // Đường dẫn đến mô hình Vosk
        Model model = new Model(modelPath);
        recognizer = new Recognizer(model, 16000.0f); // Tần số mẫu của micro (16 kHz)

        // Tạo giao diện người dùng
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);

        TextArea textArea = new TextArea();
        textArea.setEditable(false);
        textArea.setWrapText(true);

        Button startStopButton = new Button("Start Recording");
        startStopButton.setOnAction(e -> {
            if (isRecording) {
                stopRecording();
                startStopButton.setText("Start Recording");
            } else {
                startRecording(textArea);
                startStopButton.setText("Stop Recording");
            }
        });

        root.getChildren().addAll(startStopButton, textArea);

        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("Speech to Text");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    // Bắt đầu ghi âm
    private void startRecording(TextArea textArea) {
        isRecording = true;
        try {
            microphone = getMicrophone();
            byte[] buffer = new byte[4096];
            new Thread(() -> {
                while (isRecording) {
                    int bytesRead = microphone.read(buffer, 0, buffer.length);
                    if (recognizer.acceptWaveForm(buffer, bytesRead)) {
                        String result = recognizer.getResult();
                        textArea.appendText(result + "\n");
                    }
                }
            }).start();
            microphone.start();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    // Dừng ghi âm
    private void stopRecording() {
        isRecording = false;
        if (microphone != null) {
            microphone.stop();
            microphone.close();
        }
    }

    // Lấy microphone
    private TargetDataLine getMicrophone() throws LineUnavailableException {
        AudioFormat format = new AudioFormat(16000, 16, 1, true, false);
        DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);
        TargetDataLine microphone = (TargetDataLine) AudioSystem.getLine(info);
        microphone.open(format);
        return microphone;
    }
}