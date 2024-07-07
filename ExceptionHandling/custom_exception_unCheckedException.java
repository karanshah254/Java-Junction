import java.util.Scanner;

class UnderAgeException extends RuntimeException {
    UnderAgeException() {
        super("Age is less than 18");
    }
}

public class custom_exception_unCheckedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age :");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new UnderAgeException();
            } else {
                System.out.println("Age is above 18");
            }
        } catch (UnderAgeException e) {
            e.printStackTrace();
        }
        System.out.println("Program ended");
    }
}