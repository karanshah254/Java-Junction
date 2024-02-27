import java.util.*;

public class factorial {
    // function
    public static int findFactorial(int n) {
        // code 
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        int answer = findFactorial(number);
        System.out.print("Factorial is " + answer);
        sc.close();
    }
}
