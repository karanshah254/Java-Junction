import java.util.*;

public class half_right_pyramid_2D_array {
    public static void main(String[] args) {
        int rows = 4;
        int k = 0;
        int[][] pyramid = new int[rows][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                pyramid[i][j] = 1;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (pyramid[i][j] == 1) {
                    System.out.print(k + " ");
                    k++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}