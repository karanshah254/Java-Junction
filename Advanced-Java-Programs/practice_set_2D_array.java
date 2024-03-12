public class practice_set_2D_array {
    public static void question_1(int question1[][]) {
        int count = 0;
        for (int i = 0; i < question1.length; i++) {
            for (int j = 0; j < question1[0].length; j++) {
                if (question1[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println("Number of times 7's is " + count);
    }

    public static void question_2(int question2[][]) {
        int sum = 0;
        for (int i = 0; i < question2.length; i++) {
            for (int j = 0; j < question2[0].length; j++) {
                if (i == 1) {
                    sum += question2[i][j];
                }
            }
        }
        System.out.println("Sum of 2nd row is " + sum);
    }

    public static void question_3(int question3[][]) {
        int transpose[][] = new int[3][3];
        for (int i = 0; i < question3.length; i++) {
            for (int j = 0; j < question3[0].length; j++) {
                transpose[j][i] = question3[i][j];
            }
        }
        System.out.println("Transpose is : ");
        for (int i = 0; i < question3.length; i++) {
            for (int j = 0; j < question3[0].length; j++) {
               System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Q-1
        int question1[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        question_1(question1);

        // Q-2
        int question2[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        question_2(question2);

        // Q-3
        int question3[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        question_3(question3);
    }
}
