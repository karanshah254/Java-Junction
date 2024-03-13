import java.util.Scanner;

public class check_palidrome_string {
    public static boolean palidrome(String string) {
        int n = string.length();
        for (int i = 0; i < n / 2; i++) {
            if (string.charAt(i) != string.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check palidrome or not : ");
        String string = sc.nextLine();

        // check for palidrome
        System.out.println(palidrome(string));
        sc.close();
    }
}
