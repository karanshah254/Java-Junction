public class array_practice_set_1 {
    // Q-1 Given an integer array nums, return true if any value appears at least
    // twice in the array, and return false if every element is distinct
    public static boolean question1(int number[]) {
        System.out.print("Original array is : ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] == number[j + 1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 1 };
        System.out.println("\nAnswer of Q-1 is " + question1(number));

    }
}
