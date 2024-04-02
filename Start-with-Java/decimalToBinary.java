import java.util.*;

public class decimalToBinary {
    public static void decToBin(int decimal) {
        int originalNumber = decimal;
        int power = 0;
        int binary = 0;
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = binary + (remainder * (int) Math.pow(10, power));
            power++;
            decimal /= 2;
        }
        System.out.println("The binary representation of " + originalNumber + " = " + binary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int deciamal = sc.nextInt();
        decToBin(deciamal);
        sc.close();
    }
}
