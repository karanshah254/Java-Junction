import java.util.ArrayList;

public class introduction {
    public static void main(String[] args) {
        // create a array-list which is Java Collection FrameWork
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        // add operations
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(2, 20);
        System.out.println(list1); // has dynamic size

        // get operation
        System.out.println("At index 1 => " + list1.get(1));

        // remove element
        // list1.remove(0);
        // System.out.println(list1);

        // set element at index
        list1.set(1, 18);
        System.out.println("After changing " + list1);

        // contains element
        System.out.println("Number 18 exists => " + list1.contains(18));
        System.out.println("Number 7 exists => " + list1.contains(7));

        // size of array-list
        System.out.println("Size of an arraylist => " + list1.size());

        // print array-list
        System.out.print("Number are => ");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
    }
}