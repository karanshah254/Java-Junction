import java.util.ArrayList;

public class swap_two_numbers {
    public static void swap(ArrayList<Integer> number, int index1, int index2) {
        int temp = number.get(index1);
        number.set(index1, number.get(index2));
        number.set(index2, temp);
    }

    public static void main(String[] args) {
        int index1 = 1, index2 = 3;
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        System.out.println("Original array list is " + number);
        swap(number, index1, index2);
        System.out.println("After swappping array list is " + number);
    }
}