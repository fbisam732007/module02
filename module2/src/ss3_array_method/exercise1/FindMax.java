package ss3_array_method.exercise1;
import java.util.Scanner;
public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so hang: ");
        int rows = sc.nextInt();

        System.out.print("Nhap so cot: ");
        int cols = sc.nextInt();

        double[][] array = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhap phan tu [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextDouble();
            }
        }

        double max = array[0][0];
        int row = 0;
        int col = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println("Gia tri lon nhat: " + max);
        System.out.println("Toa do: [" + row + "][" + col + "]");

        sc.close();
    }
}
