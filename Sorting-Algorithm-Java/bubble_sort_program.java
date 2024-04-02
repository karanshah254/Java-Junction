public class bubble_sort_program {
    public static void bubbleSortAscending(int array[]) {
        // ascending order
        for (int turn = 0; turn < array.length - 1; turn++) {
            for (int j = 0; j < array.length - 1 - turn; j++) {
                if (array[j] > array[j + 1]) {
                    // swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortDescending(int array[]) {
        // descending order
        for (int turn = 0; turn < array.length - 1; turn++) {
            for (int j = 0; j < array.length - 1 - turn; j++) {
                if (array[j] < array[j + 1]) {
                    // swap
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int array[] = { 5, 3, 1, 2, 4 };
        System.out.print("Original Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        bubbleSortAscending(array);
        System.out.print("\nAscending order Sorted Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        bubbleSortDescending(array);
        System.out.print("\nDescending order Sorted Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}