package test_slack.project1;

public abstract class Oto extends PhuongTien {
    private int soChoNgoi;
    private String kieuXe;


    public Oto() {
    }

    public Oto(String bienKiemSoat, Hangsanxuat hangsanxuat, int namSanXuat, String chuSoHuu) {
        super(bienKiemSoat, hangsanxuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String getThongTinRieng() {
        return "số chỗ ngồi: " + soChoNgoi + "kiểu xe: " + kieuXe;
          }
}
