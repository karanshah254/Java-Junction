class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class program_2 {
    public static void throwCustomException() throws CustomException {
        throw new CustomException("Custom Exception throws");
    }

    public static void main(String[] args) {
        try {
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.err.println("Arithemtic exception caught: " + e.getMessage());
            }
            try {
                throwCustomException();
            } catch (CustomException e) {
                System.err.println("Custom exception caught: " + e.getMessage());
            }
            try {
                String str = null;
                System.out.println(str.length());
            } catch (NullPointerException e) {
                System.err.println("Null Pointer exception caught: " + e.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Exception caught in main: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}