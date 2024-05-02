class FirstArgumentException extends Exception {
    public FirstArgumentException(String message) {
        super(message);
    }
}

public class program_5 {
    public static void main(String[] args) {
        try {
            // Check if command-line arguments are provided
            if (args.length == 0) {
                throw new IllegalArgumentException("No command-line arguments provided");
            }

            int firstArg = Integer.parseInt(args[0]);
            if (firstArg == 0) {
                throw new FirstArgumentException("Custom Exception: First argument is 0");
            }

            System.out.println("First argument: " + firstArg);
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException: " + e.getMessage());
        } catch (FirstArgumentException e) {
            System.err.println("Custom Exception caught: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
        }
    }
}