public class reverse_array {
    public static void reverseArray(int array[]) {
        int start = 0, end = array.length - 1;

        while (start < end) {
            // swap numbers
            int temp = array[end];
            array[end] = array[start];
            array[start] = temp;

            end--;
            start++;
        }
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.print("Original array is : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        //reverse an array
        reverseArray(array);
        System.out.print("\nAfter reversing array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
