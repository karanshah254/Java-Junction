public class program_3 {
    public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (list[mid].compareTo(key) == 0) {
                return mid;
            } else if (list[mid].compareTo(key) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] list = { 1, 3, 5, 7, 9 };
        int key = 5;
        System.out.println("Search key is " + key);
        int index = binarySearch(list, key);
        if (index != -1) {
            System.out.println("Key " + key + " found at index " + index);
        } else {
            System.out.println("Key " + key + " not found");
        }
    }
}