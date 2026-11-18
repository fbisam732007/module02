package test_slack.project1.service;

import test_slack.project1.entity.HangSanXuat;
import test_slack.project1.entity.PhuongTien;
import test_slack.project1.entity.XeMay;
import test_slack.project1.entity.XeTai;
import test_slack.project1.repository.HangSanXuatRepository;
import test_slack.project1.repository.PhuongTienRepository;

import java.util.List;

public class PhuongTienService {
    private final PhuongTienRepository phuongTienRepo;
    private final HangSanXuatRepository hangRepo;

    public PhuongTienService(PhuongTienRepository phuongTienRepo, HangSanXuatRepository hangRepo) {
        this.phuongTienRepo = phuongTienRepo;
        this.hangRepo = hangRepo;
        khoiTaoDuLieu();
    }

    private void khoiTaoDuLieu() {
        phuongTienRepo.save(new XeTai("43C-12345", hangRepo.findByTen("Hyundai"), 2019, "Võ A Sâm", 3.5));
    }

    public List<HangSanXuat> layDanhSachHang() {
        return hangRepo.findAll();
    }

    public HangSanXuat timHang(String ten) {
        return hangRepo.findByTen(ten);
    }

    public List<PhuongTien> layDanhSach() {
        return phuongTienRepo.findAll();
    }

    public PhuongTien timTheoBienSo(String bienSo) {
        return phuongTienRepo.findByBienSo(bienSo);
    }

    public boolean daTonTai(String bienSo) {
        return timTheoBienSo(bienSo) != null;
    }

    public void themXeTai(String bienSo, HangSanXuat hang, int namSX, String chuSoHuu, double trongTai) {
        phuongTienRepo.save(new XeTai(bienSo, hang, namSX, chuSoHuu, trongTai));
    }

    public void themXeMay(String bienSo, HangSanXuat hang, int namSX, String chuSoHuu, int congSuat) {
        phuongTienRepo.save(new XeMay(bienSo, hang, namSX, chuSoHuu, congSuat));
    }

    public void capNhatHang(PhuongTien p, HangSanXuat hang) {
        p.setHangsanxuat(hang);
    }

    public void capNhatNamSanXuat(PhuongTien p, int nam) {
        p.setNamSanXuat(nam);
    }

    public void capNhatChuSoHuu(PhuongTien p, String chuSoHuu) {
        p.setChuSoHuu(chuSoHuu);
    }

    public void capNhatTrongTai(XeTai xe, double trongTai) {
        xe.setTrongTai(trongTai);
    }

    public void capNhatCongSuat(XeMay xe, int congSuat) {
        xe.setCongSuat(congSuat);
    }

    public boolean xoa(String bienSo) {
        PhuongTien p = timTheoBienSo(bienSo);
        return p != null && phuongTienRepo.delete(p);
    }
}
