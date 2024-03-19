class Rectangle {
    double width, height;

    Rectangle() {
        width = height = 1;
    }

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class program_2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);

        System.out.println("->For Rectangle 1");
        System.out.println("Area of R1 is " + r1.getArea() + "\nPerimeter of R1 is " + r1.getPerimeter());

        System.out.println("\n->For rectangle 2");
        Rectangle r2 = new Rectangle(3.5, 35.9);
        System.out.println("Area of R2 is " + r2.getArea() + "\nPerimeter of R2 is " + r2.getPerimeter());
    }
}