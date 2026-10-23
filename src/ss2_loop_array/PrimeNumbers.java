package ss2_loop_array;

import java.util.Scanner;

public class PrimeNumbers {

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Số lượng số nguyên tố cần in là: ");
        int numbers = scanner.nextInt();

        int count = 0;
        int N = 2;

        System.out.println(numbers + " số nguyên tố đầu tiên:");

        while (count < numbers) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
        scanner.close();
    }
}
