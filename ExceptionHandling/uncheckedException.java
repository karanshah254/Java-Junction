public class uncheckedException {
    public static void main(String[] args) {
        // Run Time exception handle while running program

        try {
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            e.printStackTrace(); // prints whole object
            System.out.println(e.toString()); // Name and Description of exception, also S.O.P(e);
            System.out.println(e.getMessage()); // Only description of exception
        }
        System.out.println("Program ended");
    }
}