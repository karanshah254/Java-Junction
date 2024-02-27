import java.util.*;

public class primeNumberInRange {
    // check prime
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // finding prime number between given range
    public static void primeRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range : ");
        int range = sc.nextInt();
        System.out.print("Prime Number between " + range + " are : ");
        primeRange(range);
        sc.close();
    }
}
