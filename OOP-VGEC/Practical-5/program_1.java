abstract class Shape {
    abstract double area();
}

class Traingle extends Shape {
    double base, height;

    Traingle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    double length, breath;

    Rectangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }

    double area() {
        return length * breath;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

public class program_1 {
    public static void main(String[] args) {
        Traingle t = new Traingle(10, 5);
        Rectangle r = new Rectangle(20, 30);
        Circle c = new Circle(50);

        System.out.println("Area of Traingle is : " + t.area());
        System.out.println("Area of Rectangle is " + r.area());
        System.out.println("Area of Circle is " + c.area());
    }
}