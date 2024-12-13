package th.hoangduyan.simpledict;

public class DictionaryValue {
    String phienAm, nghiaTiengViet;

    public DictionaryValue(String phienAm, String nghiaTiengViet) {
        this.phienAm = phienAm;
        this.nghiaTiengViet = nghiaTiengViet;
    }

    public String getPhienAm() {
        return phienAm;
    }

    public void setPhienAm(String phienAm) {
        this.phienAm = phienAm;
    }

    public String getNghiaTiengViet() {
        return nghiaTiengViet;
    }

    public void setNghiaTiengViet(String nghiaTiengViet) {
        this.nghiaTiengViet = nghiaTiengViet;
    }
}
