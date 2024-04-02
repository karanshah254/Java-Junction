public class differentPattern {
    public static void main(String[] args) {
        /*
         * 1.
         * 000
         * 000
         * 000
         */
        {
            int i, j;
            for (i = 1; i <= 3; i++) {
                for (j = 1; j <= 3; j++) {
                    System.out.print("0");
                }
                System.out.print("\n");
            }
        }

        /*
         * 2.
         * 0
         * 00
         * 000
         * 0000
         */
        System.out.print("\n");
        {
            for (int a = 1; a <= 4; a++) {
                for (int b = 1; b <= a; b++) {
                    System.out.print("0");
                }
                System.out.println();
            }
        }

        /*
         * 3.
         * 0000
         * 000
         * 00
         * 0
         */

        System.out.println();
        {
            for (int c = 4; c >= 1; c--) {
                for (int d = c; d >= 1; d--) {
                    System.out.print("0");
                }
                System.out.println();
            }
        }

        /*
         * 4.
         * 1
         * 12
         * 123
         * 1234
         *
         */
        System.out.println();
        {
            for (int e = 1; e <= 4; e++) {
                for (int f = 1; f <= e; f++) {
                    System.out.print(f);
                }
                System.out.println();
            }
        }
        /*
         * 5.
         * A
         * BC
         * DEF
         * GHIJ
         */
        System.out.println();
        char ch = 'A';
        {
            for (int line = 1; line <= 4; line++) {
                for (int chars = 1; chars <= line; chars++) {
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
            }
        }

    }
}
