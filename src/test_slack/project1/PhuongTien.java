package test_slack.project1;

public abstract class PhuongTien {
    private String bienKiemSoat;
    private Hangsanxuat hangsanxuat;
    private int namSanXuat;
    private String chuSoHuu;

    public PhuongTien() {
    }

    public PhuongTien(String bienKiemSoat, Hangsanxuat hangsanxuat, int namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangsanxuat = hangsanxuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public Hangsanxuat getHangsanxuat() {
        return hangsanxuat;
    }

    public void setHangsanxuat(Hangsanxuat hangsanxuat) {
        this.hangsanxuat = hangsanxuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }
    public abstract String getThongTinRieng();

    public void hienthi() {
        System.out.println(this);
    }

         @Override
    public String toString() {
             return String.format("Biển số: %-12s  hãng: %-9s   năm: %d   chủ sở hữu: %-12s    %s, ",
                bienKiemSoat, hangsanxuat.getTenHang(), namSanXuat,chuSoHuu, getThongTinRieng());
             }
}

