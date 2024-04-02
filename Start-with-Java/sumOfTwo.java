import java.util.*;

public class sumOfTwo {
    public static void main(String[] args) {
        // code to sum two numbers
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int number2 = in.nextInt();
        int sum = number1 + number2;
        System.out.println("Sum of a and b is " + sum);
        in.close();
    }
}
