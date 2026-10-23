package ss4_class_object;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        System.out.println("--------Chạy chương trình------" +
                "\n1. Hiển thị list" +
                "\n2. Thêm" +
                "\n3. Xóa" +
                "\n4. Tìm kiếm" +
                "\n5. Kết thúc");
        System.out.println("----Chọn chức năng:-----");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Hiện danh sách: ");
                studentManager.showList();
                break;
            case 2:
                System.out.println("Thêm sinh viên");
                System.out.print("Nhập id: ");
                int id = Integer.parseInt(scanner.nextLine());

                System.out.print("Nhập tên bạn: ");
                String name = scanner.nextLine();

                System.out.print("Nhập địa chỉ: ");
                String address = scanner.nextLine();

                studentManager.add(new Student(id, name, address));
                break;

            case 3:
                System.out.println("Xóa sinh viên theo id:");
                System.out.print("Nhập id cần xóa: ");
                int idDelete = Integer.parseInt(scanner.nextLine());

                if (studentManager.deleteById(idDelete)) {
                    System.out.println("Xóa thành công!");
                } else {
                    System.out.println("Không tìm thấy sinh viên có id = " + idDelete);
                }
                break;
            case 4:

                System.out.println("Tìm kiếm");
                System.out.println("nhập tên cần tìm: ");
                String searchName = scanner.nextLine();
                studentManager.search(searchName);

        }
    }
}