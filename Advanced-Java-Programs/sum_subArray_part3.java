public class sum_subArray_part3 {
    // kadane's alogirithm
    public static void kadanes(int number[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < number.length; i++) {
            currentSum += number[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println("Our maximum sub array sum is : " + maxSum);
    }

    public static void main(String[] args) {
        int number[] = { 1, -2, 6, -1, 3 };
        kadanes(number);
    }
}
