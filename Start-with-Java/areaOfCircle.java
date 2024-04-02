import java.util.*;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Enter radius of circle: ");
        double radius = sc.nextDouble();
        double area = pi * radius * radius;
        System.out.println("Area of circle is " + area);
        sc.close();
    }
}
