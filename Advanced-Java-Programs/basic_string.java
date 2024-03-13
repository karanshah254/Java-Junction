import java.util.Scanner;

public class basic_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Karan Shah";
        System.out.println(str);

        // length of string
        System.out.println("Length is " + str.length());

        // concatenation of string
        String str1 = "Hello Myself ";
        System.out.println(str1.concat(str));

        // print a character
        String str2 = "Karan Shah";
        for (int i = 0; i < str2.length(); i++) {
            System.out.print(str2.charAt(i) + " ");
        }

        // convert string to uppercase
        String str3 = "karann";
        System.out.println("\nUsing uppercase string is " + str3.toUpperCase());

        // convert string to lowercase
        String str4 = "KARANN";
        System.out.println("\nUsing lowercase string is " + str4.toLowerCase());
        sc.close();
    }
}