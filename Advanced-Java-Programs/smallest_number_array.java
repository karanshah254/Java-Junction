import java.util.*;

public class smallest_number_array {
    public static int getSmallest(int number[]) {
        Scanner sc = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE; // +infinty
        System.out.println("Enter numbers : ");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }

        for (int i = 0; i < number.length; i++) {
            if (number[i] < smallest) {
                smallest = number[i];
            }
        }
        sc.close();
        return smallest;
    }

    public static void main(String[] args) {
        int number[] = new int[5];
        System.out.println("Smallest number is : " + getSmallest(number));
    }
}
