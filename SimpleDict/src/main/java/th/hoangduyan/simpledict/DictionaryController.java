package th.hoangduyan.simpledict;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

public class DictionaryController implements Initializable {
    @FXML
    private AnchorPane addLayout;

    @FXML
    private TextField adverbAdd;

    @FXML
    private TextField exampleAdd;

    @FXML
    private Label exampleTxt;

    @FXML
    private AnchorPane findLayout;

    @FXML
    private Label loaiTuTxt;

    @FXML
    private TextField meaningAdd;

    @FXML
    private Label nghiaTxt;

    @FXML
    private Label phienAmTxt;

    @FXML
    private Button themTu;

    @FXML
    private Button timBtn;

    @FXML
    private TextField transcriptionAdd;

    @FXML
    private TextField tuDichTxt;

    @FXML
    private TextField wordAdd;

    @FXML
    private Label wordFind;


    private HashMap<String, DictionaryValue> translate = new HashMap<>();
    private boolean open;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        translate.put("constructor", new DictionaryValue("kənˈstrəktər", "người xây dựng", "noun", "He is a constructor"));
        translate.put("engineer", new DictionaryValue("ˌɛnʤɪˈnɪər", "kỹ sư", "noun", ""));
        translate.put("architect", new DictionaryValue("ˈɑːrkɪtɛkt", "kiến trúc sư", "noun", ""));
        translate.put("teacher", new DictionaryValue("ˈtiːʧər", "giáo viên", "noun", ""));
        translate.put("student", new DictionaryValue("ˈstuːdənt", "học sinh", "noun", ""));
        translate.put("developer", new DictionaryValue("dɪˈvɛləpər", "nhà phát triển", "noun", ""));
        translate.put("designer", new DictionaryValue("dɪˈzaɪnər", "nhà thiết kế", "noun", ""));
        translate.put("manager", new DictionaryValue("ˈmænɪʤər", "quản lý", "noun", ""));
        translate.put("accountant", new DictionaryValue("əˈkaʊntənt", "kế toán", "noun", ""));
        translate.put("doctor", new DictionaryValue("ˈdɒktər", "bác sĩ", "noun", ""));
        translate.put("artist", new DictionaryValue("ˈɑːrtɪst", "nghệ sĩ", "noun", ""));
        open = true;
        findLayout.setVisible(true);
        addLayout.setVisible(false);
    }

    public DictionaryValue search(String word) {
        return translate.get(word.toLowerCase());
    }

    public void translate(ActionEvent event) {
        String word = tuDichTxt.getText().trim().toLowerCase();
        wordFind.setText(tuDichTxt.getText().trim().toLowerCase());
        DictionaryValue value = search(word);

        if (value != null) {
            exampleTxt.setText(value.getViDu());
            loaiTuTxt.setText(value.getLoaiTu());
            phienAmTxt.setText(value.getPhienAm());
            nghiaTxt.setText(value.getNghiaTiengViet());
        } else {
            phienAmTxt.setText("Không tìm thấy");
            nghiaTxt.setText("không tìm thấy");
        }
    }

    public void themTuDich(ActionEvent event) {
        open = !open;
        findLayout.setVisible(open);
        addLayout.setVisible(!open);
    }

    public void addWord(ActionEvent event) {
        String newWord = wordAdd.getText().trim().toLowerCase().toString();
        String adv = adverbAdd.getText().trim().toLowerCase().toString();
        String trans = transcriptionAdd.getText().trim().toLowerCase().toString();
        String meaning = meaningAdd.getText().trim().toLowerCase().toString();
        String example = exampleAdd.getText().trim().toLowerCase().toString();
        DictionaryValue dic = new DictionaryValue(trans, meaning, adv, example);
        translate.put(newWord, dic);
    }
}