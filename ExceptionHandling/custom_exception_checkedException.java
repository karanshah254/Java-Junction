import java.util.Scanner;

class VotingException extends Exception {
    VotingException() {
        super("Not Eligible for voting");
    }

    VotingException(String message) {
        super(message);
    }
}

public class custom_exception_checkedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age :");
        int age = sc.nextInt();

        // checked exception
        try {
            if (age < 18) {
                throw new VotingException();
            } else {
                System.out.println("Eligible for voting");
            }
        } catch (VotingException e) {
            e.printStackTrace();
        }
        System.out.println("program ended");
    }
}