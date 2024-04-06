import java.util.ArrayList;

// 2 pointer approach
public class pair_sum_1_2pointer {
    public static boolean pairSum(ArrayList<Integer> number, int targetSum) {
        int left = 0;
        int right = number.size() - 1;
        while (left < right) {
            if (number.get(left) + number.get(right) == targetSum) {
                return true;
            }

            if (number.get(left) + number.get(right) < targetSum) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        int targetSum = 20;
        System.out.println(number);
        System.out.println("For sum = " + targetSum + " Pair exist ? " + pairSum(number, targetSum));
    }
}
