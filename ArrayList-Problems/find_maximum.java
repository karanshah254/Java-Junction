import java.util.ArrayList;

public class find_maximum {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> number = new ArrayList<>();
        number.add(2);
        number.add(5);
        number.add(10);
        number.add(0);
        number.add(3);

        System.out.println("Original list is " + number);

        for (int i = 0; i < number.size(); i++) {
            if (max < number.get(i)) {
                max = number.get(i);
            }
        }

        System.out.println("Maximum number is " + max);
    }
}