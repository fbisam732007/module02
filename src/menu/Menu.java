package menu;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isActive = true;
        while (isActive) {
            System.out.println("------APP QL sinh viên---------" +
                    "\n1. Danh sách" +
                    "\n2. Thêm học sinh" +
                    "\n3. Sửa" +
                    "\n4. Xóa " +
                    "\n5. Thoát app");
            System.out.println("---chức năng---- ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:

                    System.out.println("-----Hiện danh sách học sinh-----");
                    break;

                case 2:

                    System.out.println("----thêm học sinh---");
                    break;

                case 3:

                    System.out.println("----chức năng sửa-----");
                    break;

                case 4:

                    System.out.println("-----chức năng xóa----- ");
                    break;

                default:
                    isActive = false;

            }

        }
        System.out.println("---kết thúc chương trình------");
    }
}
