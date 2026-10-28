package ss2_loop_array;

public class PrimeUnder100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 10: ");

        for (int i = 2; i < 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " ");
            }
            }

        }
}
