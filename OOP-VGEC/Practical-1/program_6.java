import java.util.*;

public class program_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        scanner.close();

        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.println("Integers in decreasing order: " + num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println("Integers in decreasing order: " + num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.println("Integers in decreasing order: " + num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println("Integers in decreasing order: " + num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 >= num2) {
                System.out.println("Integers in decreasing order: " + num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println("Integers in decreasing order: " + num3 + ", " + num2 + ", " + num1);
            }
        }
    }
}