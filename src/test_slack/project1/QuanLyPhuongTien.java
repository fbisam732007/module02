package test_slack.project1;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

    public class QuanLyPhuongTien {
    private final Scanner scanner;
    private final List<Hangsanxuat> hangsanxuat = new ArrayList<>();
    private final List<PhuongTien> ds = new ArrayList<>();

    public QuanLyPhuongTien(Scanner scanner) {
        this.scanner = scanner;
        khoiTaoDuLieu();
    }

    private void khoiTaoDuLieu() {
        hangsanxuat.add(new Hangsanxuat("HSX-001", "Toyota", "Nhật Bản"));
        hangsanxuat.add(new Hangsanxuat("HSX-002", "Hyundai", "Hàn Quốc"));
        hangsanxuat.add(new Hangsanxuat("HSX-003", "Honda", "Nhật Bản"));

        ds.add(new XeTai("43C-12345", timHang("Hyundai"), 2019, "Võ A Sâm", 3.5));
    }

    private Hangsanxuat timHang(String ten) {
        for (Hangsanxuat hang : hangsanxuat) {
            if (hang.getTenHang().equalsIgnoreCase(ten)) return hang;
        }
        return null;
    }

    public void hienThiDanhSach() {
        if (ds.isEmpty()) {
            System.out.println("Danh sách phương tiện trống.");
            return;
        }
        System.out.println("----- Danh sách phương tiện -----");
        for (PhuongTien p : ds) {
            p.hienthi();
        }
    }

    public void themXe() {
        System.out.println("Chọn loại xe: 1. Xe tải  2. Xe máy");
        int loai = nhapInt("Lựa chọn: ");

        String bienSo = nhapString("Biển kiểm soát: ");
        if (timTheoBienSo(bienSo) != null) {
            System.out.println("Biển số đã tồn tại!");
            return;
        }

        System.out.print("Tên hãng: ");
        String tenHang = scanner.nextLine().trim();
        Hangsanxuat hang = timHang(tenHang);
        if (hang == null) {
            System.out.println("Không tìm thấy hãng. Các hãng hiện có:");
            for (Hangsanxuat h : hangsanxuat) System.out.println("  " + h);
            return;
        }

        int namSX = nhapInt("Năm sản xuất: ");
        String chuSoHuu = nhapString("Chủ sở hữu: ");

        if (loai == 1) {
            double trongTai = nhapDouble("Trọng tải (tấn): ");
            ds.add(new XeTai(bienSo, hang, namSX, chuSoHuu, trongTai));
        } else if (loai == 2) {
            int congSuat = nhapInt("Công suất (W): ");
            ds.add(new XeMay(bienSo, hang, namSX, chuSoHuu, congSuat));
        } else {
            System.out.println("Loại xe không hợp lệ.");
            return;
        }
        System.out.println("Thêm xe thành công.");
    }

    public void suaXe() {
        String bienSo = nhapString("Nhập biển số xe cần sửa: ");
        PhuongTien p = timTheoBienSo(bienSo);
        if (p == null) {
            System.out.println("Không tìm thấy xe.");
            return;
        }

        System.out.print("Tên hãng mới (Enter để giữ nguyên): ");
        String tenHang = scanner.nextLine().trim();
        if (!tenHang.isEmpty()) {
            Hangsanxuat hang = timHang(tenHang);
            if (hang == null) {
                System.out.println("Hãng không tồn tại, giữ nguyên hãng cũ.");
            } else {
                p.setHangsanxuat(hang);
            }
        }

        System.out.print("Năm sản xuất mới (Enter để giữ nguyên): ");
        String namStr = scanner.nextLine().trim();
        if (!namStr.isEmpty()) {
            try {
                p.setNamSanXuat(Integer.parseInt(namStr));
            } catch (NumberFormatException e) {
                System.out.println("Năm không hợp lệ, giữ nguyên.");
            }
        }

        System.out.print("Chủ sở hữu mới (Enter để giữ nguyên): ");
        String chu = scanner.nextLine().trim();
        if (!chu.isEmpty()) p.setChuSoHuu(chu);

           if (p instanceof XeTai) {
            System.out.print("Trọng tải mới (Enter để giữ nguyên): ");
            String s = scanner.nextLine().trim();
            if (!s.isEmpty()) {
                try { ((XeTai) p).setTrongTai(Double.parseDouble(s)); }
                catch (NumberFormatException e) { System.out.println("Không hợp lệ."); }
            }
        } else if (p instanceof XeMay) {
            System.out.print("Công suất mới (Enter để giữ nguyên): ");
            String s = scanner.nextLine().trim();
            if (!s.isEmpty()) {
                try { ((XeMay) p).setCongSuat(Integer.parseInt(s)); }
                catch (NumberFormatException e) { System.out.println("Không hợp lệ."); }
            }
        }
        System.out.println("Cập nhật thành công.");
    }

    public void xoaXe() {
        String bienSo = nhapString("Nhập biển số xe cần xóa: ");
        PhuongTien p = timTheoBienSo(bienSo);
        if (p == null) {
            System.out.println("Không tìm thấy xe.");
            return;
        }
        ds.remove(p);
        System.out.println("Đã xóa xe " + bienSo);
    }

    private PhuongTien timTheoBienSo(String bienSo) {
        for (PhuongTien p : ds) {
            if (p.getBienKiemSoat().equalsIgnoreCase(bienSo)) return p;
        }
        return null;
    }

    private String nhapString(String msg) {
        System.out.print(msg);
        return scanner.nextLine().trim();
    }

      private int nhapInt(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên hợp lệ.");
            }
        }
    }

         private double nhapDouble(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Double.parseDouble(scanner.nextLine().trim());
              } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số hợp lệ.");
                       }
          }
      }
}
