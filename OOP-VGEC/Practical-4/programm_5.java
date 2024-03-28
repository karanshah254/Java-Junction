class Employee {
    String name;
    int employeeID;

    public Employee(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public int empID() {
        return employeeID;
    }

    public void display() {
        System.out.println("Name of employee is " + name);
        System.out.println("Employee ID is " + employeeID);
    }
}

class FullTime extends Employee {
    int salary;

    public FullTime(String name, int employeeID, int salary) {
        super(name, employeeID);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void display() {
        super.display();
        System.out.println("Salary is $" + salary);
    }
}

public class programm_5 {
    public static void main(String[] args) {
        FullTime fullTime = new FullTime("Karan Shah", 124, 100000);
        System.out.println("Full-time employee information is :");
        fullTime.display();
    }
}