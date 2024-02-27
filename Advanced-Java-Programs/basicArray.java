import java.util.*;

public class basicArray {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // create array -> dataType arrayName[] = new dataTyoe[size];
        int numbers[] = { 2, 3, 4, 5, 6, 7 };
        int key = 10;
        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Key is at " + index);
        }
        Scanner sc = new Scanner(System.in);
        sc.close();
    }
}
