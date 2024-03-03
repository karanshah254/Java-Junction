public class array_practice_set_1 {
    // Q-1 Given an integer array nums, return true if any value appears at least
    // twice in the array, and return false if every element is distinct
    public static boolean question1(int array1[]) {
        System.out.print("Original array is : ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] == array1[j + 1]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Q-2 You are given an array prices where prices[i] is the price of a given stock
    // on the i th day. Return the maximum profit you can achieve from this
    // transaction. If you cannot achieve any profit, return 0.
    public static int question2(int array2[]) {
        int buy = array2[0];
        int profit = 0;
        for (int i = 1; i < array2.length; i++) {
            if (buy < array2[i]) {
                profit = Math.max(array2[i] - buy, profit);
            } else {
                buy = array2[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int array1[] = { 1, 2, 3, 1 };
        int array2[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("\nAnswer of Q-1 is " + question1(array1));
        System.out.println("\nMaximum profit after transaction is : " + question2(array2));
    }
}