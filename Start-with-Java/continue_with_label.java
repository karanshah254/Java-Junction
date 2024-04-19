import java.util.*;

public class continue_with_label {
    public static void main(String[] args) {
        a: for (int i = 1; i <= 3; i++) {
            b: for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    continue a;
                }
                System.out.println("Value of i = " + i + " Value of j = " + j);
            }
        }
    }
}