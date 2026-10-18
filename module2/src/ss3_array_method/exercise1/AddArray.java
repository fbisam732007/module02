package ss3_array_method.exercise1;
import java.util.Scanner;
public class AddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};

        System.out.print("Nhap X: ");
        int x = sc.nextInt();

        System.out.print("Nhap index: ");
        int index = sc.nextInt();

        if (index < 0 || index >= array.length - 1) {
            System.out.println("Khong chen duoc phan tu");
        } else {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }

            array[index] = x;

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }

        sc.close();
    }
}
