import java.util.ArrayList;

// find pair for sorted and rotated list matcheds target sum
public class pair_sum_2_2Pointer {
    public static boolean parSum(ArrayList<Integer> number, int targetSum) {
        int breakingPoint = -1;
        for (int i = 0; i < number.size(); i++) {
            if (number.get(i) > number.get(i + 1)) {
                breakingPoint = i;
                break;
            }
        }

        int left = breakingPoint + 1;
        int right = breakingPoint;
        int n = number.size();

        while (left != right) {
            if (number.get(left) + number.get(right) == targetSum) {
                return true;
            }

            if (number.get(left) + number.get(right) < targetSum) {
                left = (left + 1) % n;
            } else {
                right = (n + right - 1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(11);
        number.add(15);
        number.add(6);
        number.add(8);
        number.add(9);
        number.add(10);
        int targetSum = 16;
        System.out.println(number);
        System.out.println("For sum = " + targetSum + " Pair exists ? " + parSum(number, targetSum));
    }
}