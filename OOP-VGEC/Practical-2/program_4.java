import java.util.*;

public class program_4 {
    public static void arrayAddition(int array1[][], int array2[][]) {
        int c[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = array1[i][j] + array2[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arraySubtraction(int array1[][], int array2[][]) {
        int c[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = array1[i][j] - array2[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arrayMultiplication(int array1[][], int array2[][]) {
        int c[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += array1[i][k] * array2[k][j];   
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int array2[][] = { { 5, 6, 7 }, { 1, 2, 0 }, { 4, 3, 2 } };

        System.out.println("Original array 1 is : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Original array 2 is :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Enter 1 for addition\nEnter 2 for subtraction\nEnter 3 for multiplication : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Addition is selected");
                arrayAddition(array1, array2);
                break;
            case 2:
                System.out.println("Subtraction is selected");
                arraySubtraction(array1, array2);
                break;
            case 3:
                System.out.println("Multiplication is selected");
                arrayMultiplication(array1, array2);
                break;

            default:
                System.out.println("Write valid number");
        }
        sc.close();
    }
}
