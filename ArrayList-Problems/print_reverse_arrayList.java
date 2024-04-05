import java.util.ArrayList;

public class print_reverse_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("Original list is " + numbers);
        System.out.print("After reversing => ");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + ", ");
        }
    }
}
