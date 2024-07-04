import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = { 2, 6, 5, 7, 8, 9, 12, 56, 78, 99 };
        int low = 0;
        int high = array.length - 1;
        boolean flag = false;
        System.out.println("Enter search element : ");
        int search = sc.nextInt();
        while (high >= low) {
            int mid = (high + low) / 2;
            if (search == array[mid]) {
                flag = true;
                System.out.println("Element found at index " + mid);
                break;
            } else if (search < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (!flag) {
            System.out.println("Not found");
        }
    }
}
