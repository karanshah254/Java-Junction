import java.util.Scanner;

public class program_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int value = input.nextInt();

        System.out.println("The binary equivalent of "
                + value + " is " + dec2Bin(value));
    }

    public static String dec2Bin(int value) {
        String result = "";
        return dec2Bin(value, result);
    }

    public static String dec2Bin(int value, String result) {
        if (value / 2 == 0) {
            return (value % 2) + result;
        } else {
            return dec2Bin(value / 2, (value % 2) + result);
        }
    }
}