public class print_pairs_number {
    public static void printPair(int number[]) {
        int totapPair = 0;
        for (int i = 0; i < number.length; i++) {
            int curr = number[i];
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + curr + "," + number[j] + ") ");
                totapPair++;
            }
            System.out.println();
        }
        System.out.println("Total pair => " + totapPair);
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5 };
        printPair(number);
    }
}
