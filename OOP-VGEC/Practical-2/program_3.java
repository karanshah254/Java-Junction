public class program_3 {
    public static int removeDuplicate(int array[], int n) {
        int[] temp = new int[n];
        int j = 0;
        if (n == 0 || n == 1) {
            return n;
        }

        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }

        temp[j++] = array[n - 1];
        for (int i = 0; i < j; i++) {
            array[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 4, 5, 6, 7, 7 };
        int n = array.length;
        System.out.print("\nOriginal array with duplicate number are : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int length = removeDuplicate(array, n);
        System.out.print("\nNew array is : ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}