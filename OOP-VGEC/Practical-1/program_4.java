import java.util.*;

public class program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value in meter : ");
        int number = sc.nextInt();
        System.out.print("After convert into feet number is " + (number * 3.28084));
        sc.close();
    }
}
