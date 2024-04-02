import java.util.Scanner;

class Employee {
    private String name;
    private int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // displays data
    void putData() {
        System.out.println("Name is " + name + "\nSalary is " + salary);
    }

    // gets name and salary
    void getData(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee("John", 50000);
        e1.putData();

        System.out.println("\nNew entry of an employee");
        String name;
        int salary;
        System.out.print("Enter name of employee : ");
        name = sc.nextLine();
        System.out.print("Enter salary of employee : ");
        salary = sc.nextInt();
        e1.getData(name, salary);
        e1.putData();
        sc.close();
    }
}