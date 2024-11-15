package bt.duyan.logingk;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SwitchView {

    public static void switchView(String fxmlFile, Stage stage) {
        try {
            // Tải file FXML
            FXMLLoader loader = new FXMLLoader(SwitchView.class.getResource(fxmlFile));
            Parent root = loader.load();

            // Tạo scene mới
            Scene scene = new Scene(root);

            // Thay đổi scene của cửa sổ hiện tại
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
