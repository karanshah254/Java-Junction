import java.util.*;

public class check_salary_hra_da {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary, hr, da;
        System.out.println("Enter salary : ");
        salary = sc.nextDouble();

        if (salary < 1500) {
            hr = 0.1 * salary;
            da = 0.9 * salary;
        } else {
            hr = 500;
            da = 0.98 * salary;
        }

        System.out.println("Salary is " + salary);
        System.out.println("HRA is " + hr);
        System.out.println("DA is " + da);
    }
}