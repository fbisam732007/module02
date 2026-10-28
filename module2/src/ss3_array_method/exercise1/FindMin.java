package ss3_array_method.exercise1;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int SIZE = 5;
        int[] array = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            System.out.print("Nhap phan tu: ");
            array[i] = sc.nextInt();
        }

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Gia tri nho nhat: " + min);

        sc.close();
    }
}
