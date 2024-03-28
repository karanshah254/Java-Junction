import java.util.Scanner;

class Shape {
    double side1, side2;

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimention 1 : ");
        this.side1 = sc.nextInt();
        System.out.print("Enter dimention 2 : ");
        this.side2 = sc.nextInt();
        sc.close();
    }

    public void displayArea() {
        System.out.println("Area is ");
    }
}

class Triangle extends Shape {
    public void displayArea() {
        double area = 0.5 * side1 * side2;
        System.out.println("Area of triangle " + area);
    }
}

class Rectangle extends Shape {
    public void displayArea() {
        double area = side1 * side2;
        System.out.println("Area is rectangle " + area);
    }
}

public class program_6 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println("For triangle");
        t.getData();
        t.displayArea();

        Rectangle r = new Rectangle();
        System.out.println("For rectangle");
        r.getData();
        r.displayArea();
    }
}