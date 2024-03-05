public class program_5 {
    public static void sortElemnet(int number[]) {
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                int temp = 0;
                if (number[i] > number[j]) {
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        int number[] = { 2, 6, 5, 1, 8, 9, -1, -4, 10, 15 };
        System.out.print("Array elements are : ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }

        sortElemnet(number);

        System.out.print("\nSorted array is : ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}