import java.util.*;

public class program_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in pounds : ");
        double wt = sc.nextDouble();
        System.out.println("Enter height in inches");
        double ht = sc.nextDouble();

        double weightKg = wt * 0.45359237;
        double heightMeter = ht * 0.0254;

        double bmi = weightKg / (heightMeter * heightMeter);

        System.out.println("Body Mass Index is " + bmi);
        sc.close();
    }
}