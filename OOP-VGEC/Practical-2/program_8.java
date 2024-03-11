import java.util.*;

public class program_8 {
    public static boolean is_Valid_Password(String password) {

        if (password.length() < 8) {
            return false;
        }

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch))
                numCount++;
            else if (is_Letter(ch))
                charCount++;
            else
                return false;
        }
        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password : ");
        String passwd = sc.next();

        if (is_Valid_Password(passwd)) {
            System.out.println("Password is valid: " + passwd);
        } else {
            System.out.println("Not a valid password: " + passwd);
        }
        sc.close();
    }
}