import java.util.*;

public class binaryToDecimal {
    // function to create binary to deciamal 
    // formula = decimal = decimal + (lastDigit * 2^n) ... n = 0,1,2,...
    public static void binToDec(int n) {
        int originalNumber = n;
        int dec = 0;
        int pow = 0;
        
        while (n > 0) {
            int lastDigit = n % 10;
            dec = (dec + (lastDigit * (int) Math.pow(2, pow)));
            pow++;
            n = n / 10;
        }

        System.out.print("Decimal of " + originalNumber + " is " + dec);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number : ");
        int binaryNumber = sc.nextInt();
        binToDec(binaryNumber);
        sc.close();
    }
}
