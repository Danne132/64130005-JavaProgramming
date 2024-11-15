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
        double[] X_position = {100, 300, 200};
        double[] Y_position = {180, 180, 100};
        gc.fillPolygon(X_position, Y_position, 3);
        gc.strokePolygon(X_position,Y_position, 3);

        //Vẽ 2 hình tròn nhỏ
        //Hình tròn trái
        gc.fillOval(155, 225, 30, 30);
        gc.strokeOval(155, 225, 30, 30);
        //Hình tròn phải
        gc.fillOval(215, 225, 30, 30);
        gc.strokeOval(215, 225, 30, 30);

        //Vẽ 2 hình tam giác nhỏ
        //Hình tam giác trái
        double[] X_position_smallTriangleLeft = {160, 160, 180};
        double[] Y_position_smallTriangleLeft = {90, 130, 115};
        gc.strokePolygon(X_position_smallTriangleLeft, Y_position_smallTriangleLeft, 3);
        //Hình tam giác phải
        double[] X_position_smallTriangleRight = {240, 240, 220};
        double[] Y_position_smallTriangleRight = {90, 130, 115};
        gc.strokePolygon(X_position_smallTriangleRight, Y_position_smallTriangleRight, 3);

        //Vẽ hình tam giác đỏ bên trong
        double[] X_position_red = {180, 220, 200};
        double[] Y_position_red = {140, 140, 160};
        gc.setStroke(Color.RED);
        gc.strokePolygon(X_position_red, Y_position_red, 3);

        //Vẽ đường cong nhỏ màu đỏ
        //đường cong bên trái
        gc.strokeArc(160, 240, 5, 10, 90, 160, javafx.scene.shape.ArcType.OPEN);
        gc.strokeArc(170, 240, 5, 10, 90, -160, javafx.scene.shape.ArcType.OPEN);
        //Đường cong bên phải
        gc.strokeArc(225, 240, 5, 10, 90, 160, javafx.scene.shape.ArcType.OPEN);
        gc.strokeArc(235, 240, 5, 10, 90, -160, javafx.scene.shape.ArcType.OPEN);

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