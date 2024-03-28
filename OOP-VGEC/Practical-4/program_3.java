class Area {

    // area of sqaure
    public void area(double side) {
        System.out.println("Area of sqaure is " + (side * side));
    }

    // area of rectangle
    public void area(int length, int breath) {
        System.out.println("Area of rectangle is " + (length * breath));
    }

    // area of traingle
    public void area(double base, double height) {
        System.out.println("Area of traingle is " + (0.5 * base * height));
    }
}

public class program_3 {
    public static void main(String[] args) {
        Area findArea = new Area();

        findArea.area(50, 10);
        findArea.area(12);
        findArea.area(50.5, 10.5);
    }
}