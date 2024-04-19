import java.util.*;

public class read_2_number_check_diff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Value of a is " + a + " and Value of b is " + b);

        if (a - b > 0) {
            System.out.println("Diff is +ve");
        }
        if (a - b < 0) {
            System.out.println("Diff is negetive");
        }
    }
}