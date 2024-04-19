import java.util.*;

public class use_of_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Selected to find min..");
                double n, min = 0.0;
                System.out.println("Enter number :");
                n = sc.nextDouble();
                min = n;
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Enter number : ");
                    n = sc.nextDouble();
                    if (n < min) {
                        min = n;
                    }
                }
                System.out.println("Minimim number is " + min);
                break;

            case 2:
                System.out.println("Selected to find max..");
                double m, max = 0.0;
                System.out.println("Enter number :");
                m = sc.nextDouble();
                max = m;
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Enter number : ");
                    n = sc.nextDouble();
                    if (n > max) {
                        max = n;
                    }
                }
                System.out.println("Maximum number is " + max);
                break;

            case 3:
                System.out.println("Selected to find sum..");
                double sum = 0;
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Enter number " + i);
                    double num = sc.nextDouble();
                    sum += num;
                }
                System.out.println("Sum is " + sum);
                break;

            case 4:
                System.out.println("Selected to find average...");
                double avg = 0;
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Enter number " + i);
                    double a = sc.nextDouble();
                    avg += a / 5;
                }
                System.out.println("Average is " + avg);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}