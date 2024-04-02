import java.util.*;

public class useOfLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // while loop - print 1-10
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // print 1-N (where N = user range)
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        int counter = 0;
        while (counter <= N) {
            counter++;
            System.out.println(counter);
        }

        // sum of 1-N numbers
        System.out.println("Enter number : ");
        int end = sc.nextInt();
        int sum = 0, x = 1;
        while (x < end) {
            sum = sum + x;
            x++;
        }
        System.out.print("Sum is " + sum);

        // for loop - print 1-10
        int range = 10;
        for (int y = 1; y <= range; y++) {
            System.out.println(y);
        }

        // reverse a number using loop
        int number = 123456;
        System.out.print("Original number -> " + number);
        System.out.print("\nAfter reversing -> ");
        while (number > 0) {
            int lastDigit = number % 10;
            System.out.print(lastDigit);
            number /= 10;
        }

        // do-while loop
        int c = 1;
        do {
            System.out.println(c);
            c++;
        } while (c <= 10);
        sc.close();
    }
}
