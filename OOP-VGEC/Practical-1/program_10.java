import java.util.*;

public class program_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 sides of traingle : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double s = ((a + b + c) / 2);
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of triangle is " + area);
        sc.close();
    }
}