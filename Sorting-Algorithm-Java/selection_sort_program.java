public class selection_sort_program {
    public static void selectionSort_ascending(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (array[minPosition] > array[j]) {
                    minPosition = j;
                }
            }
            int temp = array[minPosition];
            array[minPosition] = array[i];
            array[i] = temp;
        }
    }

    public static void selectionSort_descending(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (array[minPosition] < array[j]) {
                    minPosition = j;
                }
            }
            int temp = array[minPosition];
            array[minPosition] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int array[] = { 5, 2, 1, 3, 4 };
        System.out.print("Original array is : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        selectionSort_ascending(array);
        System.out.print("\nSorted array in acsending is : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        selectionSort_descending(array);
        System.out.print("\nSorted array in descending is : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}