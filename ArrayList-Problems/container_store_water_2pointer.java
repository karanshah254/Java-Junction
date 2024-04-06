import java.lang.invoke.VarHandle.AccessMode;
import java.util.ArrayList;

public class container_store_water_2pointer {
    public static int storeWater(ArrayList<Integer> list) {
        int maxWater = 0;
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            int height = Math.min(list.get(left), list.get(right));
            int width = right - left;
            int currentWater = height * width;
            maxWater = Math.max(maxWater, currentWater);

            if (list.get(left) < list.get(right)) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println("Original height list => " + list);
        System.out.println("Maximum store water is => " + storeWater(list));
    }
}