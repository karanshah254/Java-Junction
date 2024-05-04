import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class program_2 {
    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(1);
        originalList.add(4);
        originalList.add(2);

        List<Integer> newList = removeDuplicates(originalList);
        System.out.println("Original list: " + originalList);
        System.out.println("List with duplicates removed: " + newList);
    }
}