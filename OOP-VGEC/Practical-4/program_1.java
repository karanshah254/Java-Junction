public class program_1 {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Please provide exactly 5 words as command-line arguments.");
            return;
        }

        for (String word : args) {
            System.out.println("Word: " + word);
            System.out.println("Reversed Word: " + reverseString(word));
            System.out.println("Is Palindrome: " + isPalindrome(word));
            System.out.println();
        }
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static boolean isPalindrome(String str) {
        String reversed = reverseString(str);
        return str.equalsIgnoreCase(reversed);
    }
}