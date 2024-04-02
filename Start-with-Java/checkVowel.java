import java.util.*;

public class checkVowel {
    public static void vowel() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character : ");
        char character = sc.next().charAt(0);
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'
                || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonent");
        }
        sc.close();
    }

    public static void main(String[] args) {
        vowel();
    }
}
