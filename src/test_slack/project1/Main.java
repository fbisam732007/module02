package test_slack.project1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QuanLyPhuongTien ql = new QuanLyPhuongTien(sc);

        boolean isActive = true;
        while (isActive) {
            System.out.println("------APP QL phương tiện giao thông---------");
            System.out.println("1. Danh sách");
            System.out.println("2. Thêm xe");
            System.out.println("3. Sửa");
            System.out.println("4. Xóa ");
            System.out.println("5. Thoát app");
            System.out.print("---chức năng---- \nChọn: ");

            int choose;
            try {
                choose = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số từ 1-5.");
                continue;
            }

            switch (choose) {
                case 1:
                    System.out.println("-----Hiện danh sách xe-----");
                    ql.hienThiDanhSach();
                    break;
                case 2:
                    System.out.println("----thêm xe---");
                    ql.themXe();
                    break;
                case 3:
                    System.out.println("----chức năng sửa-----");
                    ql.suaXe();
                    break;
                case 4:
                    System.out.println("-----chức năng xóa----- ");
                    ql.xoaXe();
                    break;
                case 5:
                    isActive = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
        System.out.println("---kết thúc chương trình------");
        sc.close();
         }
}
