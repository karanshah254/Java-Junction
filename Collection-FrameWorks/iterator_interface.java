import java.util.*; // all packages imported

public class iterator_interface {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("ArrayList => " + list);

        Iterator itr = list.iterator();
        System.out.print("By using iterator elements are ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}