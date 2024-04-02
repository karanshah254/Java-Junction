public class program_1 {
    public static void main(String[] args) {
        int matrix[][] = new int[6][6];

        int i, j;
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (i = 0; i < 6; i++) {
            int countRow = 0, countColumn = 0;
            for (j = 0; j < 6; j++) {
                if (matrix[i][j] == 1) {
                    countRow++;
                }
                if (matrix[j][i] == 1) {
                    countColumn++;
                }
            }
            if (countRow % 2 != 0) {
                System.out.println("Row " + (i + 1) + " contains odd number of 1's");
            }
            if (countColumn % 2 != 0) {
                System.out.println("Column " + (i + 1) + " contains odd number of 1's");
            }
        }
    }
}