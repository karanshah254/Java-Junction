import java.util.ArrayList;

public class arrayList_multiDiementional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> subList1 = new ArrayList<>();
        subList1.add(1);
        subList1.add(2);
        mainList.add(subList1);

        ArrayList<Integer> subList2 = new ArrayList<>();
        subList2.add(3);
        subList2.add(4);
        mainList.add(subList2);

        // prints main list = subList1 + subList2
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currentList = mainList.get(i);
            for (int j = 0; j < currentList.size(); j++) {
                System.out.print(currentList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println("Main List is => " + mainList);
    }
}