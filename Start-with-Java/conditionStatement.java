import java.util.*;

public class conditionStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // check student is pass or fail
        System.out.println("Enter marks : ");
        int marks = sc.nextInt();
        if (marks > 33) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // check age and decide person is adult or not
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("Adult! You can drive");
        } else {
            System.out.println("Child! No you cannot drive");
        }

        // check largest from 3 number
        System.out.println("Enter three number: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        if (number1 > number2) {
            if (number1 > number3) {
                System.out.println("The largest number is " + number1);
            } else {
                System.out.println("The largest number is " + number3);
            }
        } else if (number2 > number3) {
            System.out.println("The largest number is " + number2);
        } else {
            System.out.println("The largest number is " + number3);
        }

        // check even odd
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // income tax calculator
        System.out.println("Enter your income in LPA: ");
        int income = sc.nextInt();
        int tax = 0;
        if (income < 500000) {
            System.out.println("No tax");
        } else if (income >= 500000 || income <= 1000000) {
            System.out.println("20% tax");
            tax = (int) (income * 0.2);
        } else {
            System.out.println("30% tax");
            tax = (int) (income * 0.3);
        }
        System.out.println("Total income " + tax);
        sc.close();
    }
}
