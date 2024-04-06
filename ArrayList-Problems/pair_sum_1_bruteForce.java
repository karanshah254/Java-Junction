import java.util.ArrayList;

public class pair_sum_1_bruteForce {
    public static boolean pairSum(ArrayList<Integer> list, int targetSum) {
        // find pair in a sorted arrayList has target sum
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == 5) {
                    return true;
                }
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
        number.add(6);
        int targetSum = 5;
        System.out.println("Original list => " + number);
        System.out.println("For sum = " + targetSum + " Pair exists " + pairSum(number, targetSum));
    }
}