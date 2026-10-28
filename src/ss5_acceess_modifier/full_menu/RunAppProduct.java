package ss5_acceess_modifier.full_menu;

import java.util.Scanner;

public class RunAppProduct {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ProductManager productManager = new ProductManager();

            boolean isActive = true;
            while (isActive) {
                System.out.println("---------APP QUẢN LÍ SẢN PHẨM----------" + "\n1.Hiển thị danh sách" + "\n2.Thêm sản phẩm" + "\n3.Xóa sản phẩm" + "\n4.Tìm kiếm sản phẩm" + "\n5.Thoát app");
                System.out.println("-----Chức năng-----");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:

                        System.out.println("------Hiện danh sách sản phẩm-----");
                        productManager.showList();
                        break;
                    case 2:
                        System.out.println("-----Thêm sản phẩm------");
                        System.out.println("Nhập id:");
                        int id = Integer.parseInt(scanner.nextLine());

                        System.out.println("Nhập tên sản phẩm");
                        String name = scanner.nextLine();

                        System.out.println("giá tiền");
                        double price = Double.parseDouble(scanner.nextLine());
                        productManager.add(new Product(id, name, price));
                        break;
                    case 3:

                        System.out.println("Xóa sản phẩm theo id");
                        System.out.println("nhập id cần xóa");
                        int idDelete = Integer.parseInt(scanner.nextLine());

                        if (productManager.deleteById(idDelete)) {
                            System.out.println("Xóa thành công");
                        } else {
                            System.out.println("k tìm thấy sản phẩm có id : " + idDelete);

                        }
                        break;

                    case 4:
                        System.out.println("tìm kiếm");
                        System.out.println("nhập tên cần tìm");

                        String searchName = scanner.nextLine();
                        productManager.searc(searchName);
                        break;
                    case 5:
                        isActive = false;
                        break;

                    default:
                        System.out.println("lựa chọn k hợp lệ");
                        break;
                }


            }
        }
    }

