package th.hoangduyan.simpledict;

public class DictionaryValue {
    String phienAm, nghiaTiengViet, loaiTu, viDu;

    public DictionaryValue(String phienAm, String nghiaTiengViet, String loaiTu, String viDu) {
        this.phienAm = phienAm;
        this.nghiaTiengViet = nghiaTiengViet;
        this.loaiTu = loaiTu;
        this.viDu = viDu;
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

    public String getLoaiTu() {
        return loaiTu;
    }

    public void setLoaiTu(String loaiTu) {
        this.loaiTu = loaiTu;
    }

    public String getViDu() {
        return viDu;
    }

    public void setViDu(String viDu) {
        this.viDu = viDu;
    }
}
