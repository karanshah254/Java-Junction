import java.util.Scanner;

class YoungerAgeException extends RuntimeException {
    YoungerAgeException(String message) {
        super(message);
    }
}

public class throw_unCheckedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = sc.nextInt();

        // checking for user defined exception
        try {
            if (age < 18) {
                // created a custom exception manually by programmer
                System.out.println("Exception caught....");
                throw new YoungerAgeException("Not eligible for driving licence");
            } else {
                System.out.println("Eligible for driving licence");
            }
        } catch (YoungerAgeException e) {
            System.out.println(e.toString());
        }
        System.out.println("Program ended");
    }
}