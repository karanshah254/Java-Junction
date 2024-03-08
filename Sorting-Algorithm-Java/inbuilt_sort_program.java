import java.util.Arrays; // for ascending order
import java.util.Collections; // for descending order

public class inbuilt_sort_program {
    public static void main(String[] args) {
        int array[] = { 4, 7, 1, 3 };
        Integer array1[] = { 4, 7, 1, 3 };
        System.out.print("Ascending order : ");
        Arrays.sort(array); // ascending order
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\nDescending order is : ");
        Arrays.sort(array1, Collections.reverseOrder()); // descending order
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}
