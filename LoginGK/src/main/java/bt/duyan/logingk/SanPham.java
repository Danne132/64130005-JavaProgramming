package bt.duyan.logingk;

public class SanPham {
    int id;
    String tenSP;
    float donGia;

    public SanPham() {
    }

    public SanPham(int id, String tenSP, float donGia) {
        this.id = id;
        this.tenSP = tenSP;
        this.donGia = donGia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
}