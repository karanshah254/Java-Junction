class cartesianPoint {
    int x, y;

    cartesianPoint(int x1, int y1) {
        x = x1;
        y = y1;
    }

    cartesianPoint(int val) {
        x = y = val;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void move(int x2, int y2) {
        x = x2;
        y = y2;
    }

    void move(int value) {
        x = y = value;
    }
}

public class program_3 {
    public static void main(String[] args) {
        cartesianPoint p1 = new cartesianPoint(2, 3);
        System.out.println("->For point 1:");
        System.out.println("Before value of x is " + p1.getX() + " & value of y is " + p1.getY());
        p1.move(5, 6);
        System.out.println("Before value of x is " + p1.getX() + " & value of y is " + p1.getY());

        cartesianPoint p2 = new cartesianPoint(4);
        System.out.println("\n->For point 2:");
        System.out.println("Before value of x is " + p2.getX() + " & value of y is " + p2.getY());
        p2.move(10);
        System.out.println("Before value of x is " + p2.getX() + " & value of y is " + p2.getY());
    }
}