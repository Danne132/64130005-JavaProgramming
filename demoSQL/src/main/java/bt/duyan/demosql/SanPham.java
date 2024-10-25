package bt.duyan.demosql;

public class SanPham {
    private String tenSp;
    private String moTa;
    private double donGia;
    private int id;

    public SanPham() {
    }

    public SanPham(int id, String tenSp, String moTa, double donGia) {
        this.id = id;
        this.tenSp = tenSp;
        this.moTa = moTa;
        this.donGia = donGia;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getId() {
        return id;
    }
}
