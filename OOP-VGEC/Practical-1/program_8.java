import java.util.*;

public class program_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount to be withdrawn: ");
        int amount = sc.nextInt();

        int hundredNotes = amount / 100;
        amount %= 100;

        int fiftyNotes = amount / 50;
        amount %= 50;

        int tenNotes = amount / 10;
        amount %= 10;

        int fiveNotes = amount / 5;
        amount %= 5;

        int twoNotes = amount / 2;
        amount %= 2;

        int oneNotes = amount;

        System.out.println("Currency Notes Distribution:");
        System.out.println("100 : " + hundredNotes);
        System.out.println("50  : " + fiftyNotes);
        System.out.println("10  : " + tenNotes);
        System.out.println("5   : " + fiveNotes);
        System.out.println("2   : " + twoNotes);
        System.out.println("1   : " + oneNotes);

        sc.close();
    }
}