
public class largest_number_array {
    public static int getLargest(int array[]) {
        int largest = Integer.MIN_VALUE; // - infinity

        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                largest = array[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 5, 7, 4 };
        System.out.println("largest number is : " + getLargest(array));
    }
}
