package test_slack.project1.controller;

import test_slack.project1.entity.HangSanXuat;
import test_slack.project1.entity.PhuongTien;
import test_slack.project1.entity.XeMay;
import test_slack.project1.entity.XeTai;
import test_slack.project1.service.PhuongTienService;
import test_slack.project1.view.PhuongTienView;

public class PhuongTienController {
    private final PhuongTienService service;
    private final PhuongTienView view;

    public PhuongTienController(PhuongTienService service, PhuongTienView view) {
        this.service = service;
        this.view = view;
    }

    public void chay() {
        boolean isActive = true;
        while (isActive) {
            view.hienMenu();
            int choose = view.nhapLuaChonMenu();
            if (choose == -1) {
                view.thongBao("Vui lòng nhập số từ 1-5.");
                continue;
            }

            switch (choose) {
                case 1:
                    view.thongBao("-----Hiện danh sách xe-----");
                    hienThiDanhSach();
                    break;
                case 2:
                    view.thongBao("----thêm xe---");
                    themXe();
                    break;
                case 3:
                    view.thongBao("----chức năng sửa-----");
                    suaXe();
                    break;
                case 4:
                    view.thongBao("-----chức năng xóa----- ");
                    xoaXe();
                    break;
                case 5:
                    isActive = false;
                    break;
                default:
                    view.thongBao("Lựa chọn không hợp lệ.");
            }
        }
        view.thongBao("---kết thúc chương trình------");
        view.dong();
    }

    private void hienThiDanhSach() {
        view.hienDanhSach(service.layDanhSach());
    }

    private void themXe() {
        view.thongBao("Chọn loại xe: 1. Xe tải  2. Xe máy");
        int loai = view.nhapInt("Lựa chọn: ");

        String bienSo = view.nhapString("Biển kiểm soát: ");
        if (service.daTonTai(bienSo)) {
            view.thongBao("Biển số đã tồn tại!");
            return;
        }

        String tenHang = view.nhapString("Tên hãng: ");
        HangSanXuat hang = service.timHang(tenHang);
        if (hang == null) {
            view.hienDanhSachHang(service.layDanhSachHang());
            return;
        }

        int namSX = view.nhapInt("Năm sản xuất: ");
        String chuSoHuu = view.nhapString("Chủ sở hữu: ");

        if (loai == 1) {
            double trongTai = view.nhapDouble("Trọng tải (tấn): ");
            service.themXeTai(bienSo, hang, namSX, chuSoHuu, trongTai);
        } else if (loai == 2) {
            int congSuat = view.nhapInt("Công suất (W): ");
            service.themXeMay(bienSo, hang, namSX, chuSoHuu, congSuat);
        } else {
            view.thongBao("Loại xe không hợp lệ.");
            return;
        }
        view.thongBao("Thêm xe thành công.");
    }

    private void suaXe() {
        String bienSo = view.nhapString("Nhập biển số xe cần sửa: ");
        PhuongTien p = service.timTheoBienSo(bienSo);
        if (p == null) {
            view.thongBao("Không tìm thấy xe.");
            return;
        }

        String tenHang = view.nhapString("Tên hãng mới (Enter để giữ nguyên): ");
        if (!tenHang.isEmpty()) {
            HangSanXuat hang = service.timHang(tenHang);
            if (hang == null) {
                view.thongBao("Hãng không tồn tại, giữ nguyên hãng cũ.");
            } else {
                service.capNhatHang(p, hang);
            }
        }

        String namStr = view.nhapString("Năm sản xuất mới (Enter để giữ nguyên): ");
        if (!namStr.isEmpty()) {
            try {
                service.capNhatNamSanXuat(p, Integer.parseInt(namStr));
            } catch (NumberFormatException e) {
                view.thongBao("Năm không hợp lệ, giữ nguyên.");
            }
        }

        String chu = view.nhapString("Chủ sở hữu mới (Enter để giữ nguyên): ");
        if (!chu.isEmpty()) service.capNhatChuSoHuu(p, chu);

        if (p instanceof XeTai) {
            String s = view.nhapString("Trọng tải mới (Enter để giữ nguyên): ");
            if (!s.isEmpty()) {
                try {
                    service.capNhatTrongTai((XeTai) p, Double.parseDouble(s));
                } catch (NumberFormatException e) {
                    view.thongBao("Không hợp lệ.");
                }
            }
        } else if (p instanceof XeMay) {
            String s = view.nhapString("Công suất mới (Enter để giữ nguyên): ");
            if (!s.isEmpty()) {
                try {
                    service.capNhatCongSuat((XeMay) p, Integer.parseInt(s));
                } catch (NumberFormatException e) {
                    view.thongBao("Không hợp lệ.");
                }
            }
        }
        view.thongBao("Cập nhật thành công.");
    }

    private void xoaXe() {
        String bienSo = view.nhapString("Nhập biển số xe cần xóa: ");
        if (service.xoa(bienSo)) {
            view.thongBao("Đã xóa xe " + bienSo);
        } else {
            view.thongBao("Không tìm thấy xe.");
        }
    }
}
