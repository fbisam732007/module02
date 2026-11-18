package test_slack.project1.view;

import test_slack.project1.entity.HangSanXuat;
import test_slack.project1.entity.PhuongTien;

import java.util.List;
import java.util.Scanner;

public class PhuongTienView {
    private final Scanner scanner = new Scanner(System.in);

    public void hienMenu() {
        System.out.println("------APP QL phương tiện giao thông---------");
        System.out.println("1. Danh sách");
        System.out.println("2. Thêm xe");
        System.out.println("3. Sửa");
        System.out.println("4. Xóa ");
        System.out.println("5. Thoát app");
        System.out.print("---chức năng---- \nChọn: ");
    }

    public void thongBao(String msg) {
        System.out.println(msg);
    }

    public void hienDanhSach(List<PhuongTien> ds) {
        if (ds.isEmpty()) {
            System.out.println("Danh sách phương tiện trống.");
            return;
        }
        System.out.println("----- Danh sách phương tiện -----");
        for (PhuongTien p : ds) {
            p.hienthi();
        }
    }

    public void hienDanhSachHang(List<HangSanXuat> dsHang) {
        System.out.println("Không tìm thấy hãng. Các hãng hiện có:");
        for (HangSanXuat h : dsHang) System.out.println("  " + h);
    }

    public int nhapLuaChonMenu() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public String nhapString(String msg) {
        System.out.print(msg);
        return scanner.nextLine().trim();
    }

    public int nhapInt(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên hợp lệ.");
            }
        }
    }

    public double nhapDouble(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số hợp lệ.");
            }
        }
    }

    public void dong() {
        scanner.close();
    }
}
