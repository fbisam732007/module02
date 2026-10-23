package ss1_java_overview.excercise_2;

import java.util.Scanner;

public class Exercise2 {
    static final double RATE = 25907;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập tiền USD: ");
        double USD = scanner.nextDouble();

        double VND = USD * RATE;
        System.out.printf("%.2f USD = %,.0f VND%n", USD, VND);
        scanner.close();

    }
}
