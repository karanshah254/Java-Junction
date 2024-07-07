public class use_of_finally_block {
    public static void main(String[] args) {
        try {
            int a = 100, b = 0, c;
            c = a / b; // line in which exception may or may not occur...
            System.out.println(c);
        } catch (ArithmeticException e) {
            // execured if exception occurs
            System.out.println("Exception : " + e.toString());
        } finally {
            System.out.println("Finally block | This will execute wheather exception occurs or not");
        }
    }
}