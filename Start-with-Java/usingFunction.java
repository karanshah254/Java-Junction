import java.util.*;

public class usingFunction {
    public static void printHelloWorld() {
        System.out.println("Hello");
        return;
    }

    // function with paramater or formal parameter
    public static void findSum(int a, int b) {
        System.out.println("Sum is " + (a + b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        findSum(a, b); // a and b are arguments or actual parameters
    }
}
