public class binary_search {
    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int key = 10;
        System.out.println("Search key is " + key);
        int flag = binarySearch(arr, key);
        if (flag != -1) {
            System.out.println("Element found at index " + flag);
        } else {
            System.out.println("Not found");
        }
    }
}
