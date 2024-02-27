import java.util.*;

public class practiceSet2 {

    // calculator in java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number of user choice : ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println("Press 1 for +\nPress 2 for -\nPress 3 for *\nPress 4 for /\nPress 5 for %: ");
        char choice = sc.next().charAt(0);

        float result;
        switch (choice) {
            case '+':
                result = (int) (number1 + number2);
                System.out.println(result);
                break;
            case '-':
                result = (int) (number1 - number2);
                System.out.println(result);
                break;
            case '*':
                result = (int) (number1 * number2);
                System.out.println(result);
                break;
            case '/':
                result = (int) (number1 / number2);
                System.out.println(result);
                break;
            case '%':
                result = number1 % number2;
                System.out.println(result);
                break;

            default:
                System.out.println("Please enter valid operator");
        }

        // check if you have fever or not (tempreture > 100)
        System.out.println("Enter tempreture : ");
        int tempreture = sc.nextInt();
        if (tempreture > 100) {
            System.out.println("you have fever");
        } else {
            System.out.println("you dont have fever");
        }

        // check leap year
        System.out.println("Enter year : ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }
        sc.close();
    }
}
