package test_slack.project1;

public class XeMay extends PhuongTien {
    private int congSuat;

    public XeMay() {
    }

        public XeMay(String bienKiemSoat, HangSanXuat hangsanxuat, int namSanXuat, String chuSoHuu, int congSuat) {
        super(bienKiemSoat, hangsanxuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String getThongTinRieng() {
        return "Công suất: " + congSuat + " W";
         }
}
