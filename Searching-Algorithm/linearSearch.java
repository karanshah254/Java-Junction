import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = { 1, 2, 3, 4, 5, 6, 7 };
        boolean flag = false;
        int length = array.length;
        System.out.println("Enter search element: ");
        int search = sc.nextInt();

        for (int i = 0; i < length; i++) {
            if (search == array[i]) {
                flag = true;
                System.out.println("Element found at index " + i);
            }
        }

        if (!flag) {
            System.out.println("NOT found");
        }
    }
}
