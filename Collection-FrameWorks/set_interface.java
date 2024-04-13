import java.util.*;

public class set_interface {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // adds element in set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Kiwi");

        System.out.println("Set is " + set);
        // set.add("Apple"); ignore duplicate values

        set.remove("Kiwi");
        System.out.println("New set is " + set);

        System.out.println("Size of set is " + set.size());
        System.out.println("Does set contains 'Watermelon' ...? " + set.contains("Watermelon"));
    }
}