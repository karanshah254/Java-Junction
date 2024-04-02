import java.util.*;

public class operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // 1. add (+) opeartion
        int sumOfTwo = num1 + num2;
        System.out.println("Sum of two numbers are " + sumOfTwo);

        // 2. subtraction (-) operation
        int diffOfTwo = num1 - num2;
        System.out.println("Diffrence of two numbers are " + diffOfTwo);

        // 3. multiplication (*) operation
        int productOFTwo = num1 * num2;
        System.out.println("Product of two numbers are " + productOFTwo);

        // 4. Division (/) operation
        int quotient = num1 / num2;
        System.out.println("Quotient of two numbers are " + quotient);

        // 5. Modulo (%) operator
        int remainder = num1 % num2;
        System.out.println("Remainder of two numbers are " + remainder);
        sc.close();

        // Relational operator:
        // 1. == -> equal to
        // 2. != -> not equal to
        // 3. > -> greater than
        // 4. < -> less than
        // 5. >= -> greater than equal to
        // 6. <= -> less than equal to

        // Logical operator
        // 1. && -> AND (both true than final true)
        // 2. || -> OR (either true than final true)
        // 3. ! -> NOT (toggles the input)

        // ternary operator
        String check;
        int adultAge = 56;
        check = adultAge > 18 ? "Adult" : "Child";
        System.out.println(check);

        // switch case statement
        String ch = "Apple";
        switch (ch) {
            case "Apple":
                System.out.println("This is apple");
                break;
            default:
                System.out.println("Not an apple");
        }
    }
}
