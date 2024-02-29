public class max_subArray_sum {
    public static void findMax(int number[]) {
        // brute force 
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                {
                    int end = j;
                    currSum = 0;
                    for (int k = start; k <= end; k++) {
                        // sum of subb array
                        currSum += number[k];
                    }
                    if (maxSum < currSum) {
                        maxSum = currSum;
                    }
                }
            }
        }
        System.out.println("Max sum of a sub array is => " + maxSum);
    }

    public static void main(String[] args) {
        int number[] = { 1, -2, 6, -1, 3 };
        findMax(number);
    }
}