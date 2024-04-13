import java.util.*;

public class list_interface {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(0);
        l1.add(1);
        l1.add(2);
        System.out.println("ArrayList elements are " + l1);

        List<String> l2 = new ArrayList<>();
        l2.add("John");
        l2.add("Haider");
        l2.add("Laden");
        System.out.println("Linked List elements are " + l2);
    }
}