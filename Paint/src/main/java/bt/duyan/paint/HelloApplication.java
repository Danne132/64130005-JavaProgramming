package bt.duyan.paint;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Tạo Canvas để vẽ
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setStroke(Color.RED);
        gc.setLineWidth(3);
        gc.strokeLine(0,0, 0, 400);
        gc.strokeLine(0,0, 400, 0);

        gc.setLineWidth(2);
        // Vẽ Hình tròn to
        gc.setStroke(Color.BLACK);
        gc.strokeOval(150, 150, 100, 100);

        // Vẽ Hình tam giác
        gc.setFill(Color.WHITE);
        double[] X_position = {100, 340, 220};
        double[ơ]


        // Thêm Canvas vào Scene
        Group root = new Group(canvas);
        Scene scene = new Scene(root, 400, 400);
        stage.setTitle("BT vẽ hình bằng JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}