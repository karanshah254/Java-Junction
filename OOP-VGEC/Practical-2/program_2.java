public class program_2 {
    public static int minimum(int array[][]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int array[][] = { { 0, 2, 3 }, { 4, 5, 1 }, { 7, 8, 9 } };
        System.out.println("Original 2D array is : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int minimum = minimum(array);
        System.out.print("Minimum number from 2D array is " + minimum);

    }
}