package bt.duyan.paint;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class PaintController {
    @FXML
    private Button btnVehinh, btnVeChuot;
    @FXML
    private Canvas canvas;
    private double lastX, lastY;
    private boolean isDrawingMode = false;
    GraphicsContext gc;
    @FXML
    public void initialize(){
        gc = canvas.getGraphicsContext2D();
        // Bắt sự kiện nhấn chuột (chỉ khi chế độ vẽ được kích hoạt)
        canvas.setOnMousePressed(event -> {
            if (isDrawingMode) {
                lastX = event.getX();
                lastY = event.getY();
            }
        });

        // Bắt sự kiện kéo chuột để vẽ (chỉ khi chế độ vẽ được kích hoạt)
        canvas.setOnMouseDragged(event -> {
            if (isDrawingMode) {
                drawLine(gc, event);
            }
        });
    }

    public void veHinh(ActionEvent event){
        // Xóa nội dung cũ trước khi vẽ
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
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
    }

    @FXML
    public void veChuot(ActionEvent event) {
        // Xóa nội dung canvas trước khi vẽ
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        // Bật hoặc tắt chế độ vẽ
        isDrawingMode = !isDrawingMode;

        // Cập nhật nút khi bật hoặc tắt chế độ vẽ
        if (isDrawingMode) {
            btnVeChuot.setText("Tắt chế độ vẽ");
        } else {
            btnVeChuot.setText("Bật chế độ vẽ");
        }
    }

    // Phương thức để vẽ đường thẳng
    private void drawLine(GraphicsContext gc, MouseEvent event) {
        double x = event.getX();
        double y = event.getY();

        // Vẽ đường thẳng từ điểm trước đó đến điểm hiện tại
        gc.strokeLine(lastX, lastY, x, y);

        // Cập nhật lại tọa độ cuối cùng
        lastX = x;
        lastY = y;
    }
}