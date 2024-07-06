import java.util.Scanner;

public class first_last_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int firstDigit = 0, lastDigit = 0;
        lastDigit = Math.abs(number % 10);

        while (number != 0) {
            firstDigit = Math.abs(number % 10);
            number /= 10;
        }

        System.out.println("First digit is " + "'" + firstDigit + "'");
        System.out.println("Last digit is " + "'" + lastDigit + "'");
    }
}