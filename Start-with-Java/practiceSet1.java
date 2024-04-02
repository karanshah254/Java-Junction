
// set of questions
import java.util.*;

public class practiceSet1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q-1:
        System.out.println("Enter 3 numbers : ");
        float number1 = sc.nextFloat();
        float number2 = sc.nextFloat();
        float number3 = sc.nextFloat();
        float average = (number1 + number2 + number3) / 3;
        System.out.println("Average of three numbers are " + average);

        // Q-2:
        System.out.println("Enter side of square : ");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("Area of square is " + area);

        // Q-3:
        System.out.println("Enter price of pen, pencil and erasor :");
        float price_pen = sc.nextFloat();
        float price_pencil = sc.nextFloat();
        float erasor_price = sc.nextFloat();
        float total_price = (price_pen + price_pencil + erasor_price);
        System.out.println("Total cost of the items GST are $" + total_price);
        // Add 18% GST to bill..
        float newTotal = total_price + (0.18f * total_price);
        System.out.println("Final Total cost after adding GST is $" + newTotal);
        sc.close();
    }
}
