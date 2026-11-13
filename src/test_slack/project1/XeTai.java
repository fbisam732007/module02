package test_slack.project1;

public class XeTai extends PhuongTien {
    private double trongTai;

    public XeTai() {
    }

    public XeTai(String bienKiemSoat, HangSanXuat hangsanxuat, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, hangsanxuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String getThongTinRieng() {
        return "Trọng tải: " + trongTai + " tấn";
             }
}
