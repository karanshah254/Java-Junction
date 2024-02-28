public class print_sub_array {
    public static void printSubArray(int number[]) {
        int subArray = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                {
                    int end = j;
                    for (int k = start; k <= end; k++) {
                        System.out.print(number[k] + " ");
                    }
                    subArray++;
                    System.out.println();
                }
                System.out.println();
            }
        }
        System.out.println("Total sub array : " + subArray);
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5 };
        printSubArray(number);
    }
}
