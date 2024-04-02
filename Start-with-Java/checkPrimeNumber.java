import java.util.*;

public class checkPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("Prime number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println("Prime number");
            } else {
                System.out.println("Non prime number");
            }
        }
        sc.close();
    }
}
