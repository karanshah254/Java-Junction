public class method_overloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(2, 3));
        System.out.println(cal.sum(3.5, 4.5));
        System.out.println(cal.sum(4, 7, 9));
    }
}

// method overloading : same method name with diff parameters
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
