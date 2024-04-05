import java.util.ArrayList;
import java.util.Collections;

public class sort_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(0);
        list.add(3);
        list.add(10);
        list.add(365);
        System.out.println("Original array is " + list);

        Collections.sort(list);
        System.out.println("Ascending order sorting is " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending order sorting is " + list);
    }
}