import java.util.Scanner;

public class ternary_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        String result = (x == 10) ? "Value is 10" : "Value is not 10";
        System.out.println(result);
    }
}