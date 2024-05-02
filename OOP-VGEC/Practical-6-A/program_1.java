class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}

public class program_1 {
    public static double divide(int dividend, int divisor) throws DivideByZeroException {
        if (divisor == 0) {
            throw new DivideByZeroException("Cannot divide by zero");
        }
        return (double) dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            double result = divide(10, 0);
            System.out.println("Result of division is " + result);
        } catch (DivideByZeroException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}