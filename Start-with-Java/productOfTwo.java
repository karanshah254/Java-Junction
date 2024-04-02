import java.util.*;

public class productOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int number1 = in.nextInt();
        System.out.println("Enter number 2:");
        int number2 = in.nextInt();
        int product = number1 * number2;
        System.out.println("Product of two number is " + product);
        in.close();
    }
}
