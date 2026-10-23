package ss3_array_method.exercise1;

import java.util.Scanner;

public class RemoveArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};

        System.out.println("Mảng ban đầu: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Nhập phần tử cần xóa: ");
        int X = scanner.nextInt();

        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                index_del = i;
                break;
            }
        }

        if (index_del == -1) {
            System.out.println("Không có " + X + " trong mảng");
        } else {
            for (int i = index_del; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = 0;

            System.out.println("Mảng sau khi xóa " + X + ":");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
        scanner.close();
    }
}
