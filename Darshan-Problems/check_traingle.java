import java.util.*;

public class check_traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();

        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("Valid traingle");
        } else {
            System.out.println("Invalid traingle");
        }
    }
}