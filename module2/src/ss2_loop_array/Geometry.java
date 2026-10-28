package ss2_loop_array;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;

        do {
            System.out.println("----MENU--------" + "\n1. In hình chữ nhật" + "\n2. In hình tam giác vuông, có cạnh góc vuông ở botton-left" + "\n3.  In hình tam giác vuông, có cạnh góc vuông ở top-left" + "\n4.In hình tam giác cân." + "\n5. Kết thúc chương trình");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    printRectangle(scanner);
                    break;
                case 2:
                    printBottomLeft(scanner);
                    break;
                case 3:
                    printTopLeft(scanner);
                    break;
                case 4:
                    printIsosceles(scanner);
                    break;
                case 5:
                    System.out.println("hoàn thành code");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choose != 5);

        scanner.close();
    }

    static void printRectangle(Scanner scanner) {
        System.out.println("chọn chiều dài: ");
        int width = scanner.nextInt();
        System.out.println("chọn chiều rộng: ");
        int height = scanner.nextInt();

        System.out.println("\n------hình chữ nhật-------");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printBottomLeft(Scanner scanner) {
        System.out.println("Chọn kích thước: ");
        int size = scanner.nextInt();

        System.out.println("\n----hình tam giác vuông (cạnh bottom-left)----");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printTopLeft(Scanner scanner) {
        System.out.print("chọn kích thước: ");
        int size = scanner.nextInt();

        System.out.println("\n----Hình tam giác vuông (cạnh top-left)----");
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printIsosceles(Scanner scanner) {
        System.out.print("Chọn chiều cao: ");
        int height = scanner.nextInt();

        System.out.println("\n------Hình tam giác cân----");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
