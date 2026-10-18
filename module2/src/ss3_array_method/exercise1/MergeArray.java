package ss3_array_method.exercise1;
import java.util.Scanner;

public class MergeArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] array1 = new int[3];
            int[] array2 = new int[2];

            System.out.println("Nhap mang 1:");
            for (int i = 0; i < array1.length; i++) {
                array1[i] = sc.nextInt();
            }

            System.out.println("Nhap mang 2:");
            for (int i = 0; i < array2.length; i++) {
                array2[i] = sc.nextInt();
            }

            int[] array3 = new int[array1.length + array2.length];

            for (int i = 0; i < array1.length; i++) {
                array3[i] = array1[i];
            }

            for (int i = 0; i < array2.length; i++) {
                array3[array1.length + i] = array2[i];
            }

            System.out.println("Mang sau khi gop:");
            for (int i = 0; i < array3.length; i++) {
                System.out.print(array3[i] + " ");
            }

            sc.close();
        }
    }
