package th.hoangduyan.simpledict;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

public class DictionaryController implements Initializable {
    @FXML
    private Label nghiaTxt;

    @FXML
    private Label phienAmTxt;

    @FXML
    private Button timBtn;

    @FXML
    private TextField tuDichTxt;

    private HashMap<String, DictionaryValue> translate = new HashMap<>();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        translate.put("Constructor", new DictionaryValue("kənˈstrəktər", "người xây dựng"));
        translate.put("engineer", new DictionaryValue("ˌɛnʤɪˈnɪər", "kỹ sư"));
        translate.put("architect", new DictionaryValue("ˈɑːrkɪtɛkt", "kiến trúc sư"));
        translate.put("teacher", new DictionaryValue("ˈtiːʧər", "giáo viên"));
        translate.put("student", new DictionaryValue("ˈstuːdənt", "học sinh"));
        translate.put("developer", new DictionaryValue("dɪˈvɛləpər", "nhà phát triển"));
        translate.put("designer", new DictionaryValue("dɪˈzaɪnər", "nhà thiết kế"));
        translate.put("manager", new DictionaryValue("ˈmænɪʤər", "quản lý"));
        translate.put("accountant", new DictionaryValue("əˈkaʊntənt", "kế toán"));
        translate.put("doctor", new DictionaryValue("ˈdɒktər", "bác sĩ"));
        translate.put("artist", new DictionaryValue("ˈɑːrtɪst", "nghệ sĩ"));
    }

    public DictionaryValue search(String word) {
        return translate.get(word.toLowerCase());
    }

    public void translate(ActionEvent event) {
        String word = tuDichTxt.getText().trim().toLowerCase();
        DictionaryValue value = search(word);

        if (value != null) {
            phienAmTxt.setText(value.getPhienAm());
            nghiaTxt.setText(value.getNghiaTiengViet());
        } else {
            phienAmTxt.setText("Không tìm thấy");
            nghiaTxt.setText("không tìm thấy");
        }
    }

    public void themTuDich(ActionEvent event) {
    }
}