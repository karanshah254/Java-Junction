public class use_of_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Karan";
        s1.roll_no = 124;

        Student s2 = new Student(s1);
        System.out.println(s2.name);
    }
}

class Student {
    String name;
    int roll_no;

    // non parameterized constructor
    Student() {
        System.out.println("Default constructor called");
    }
    
    // parametrized constructor
    Student(String name){
        this.name = name;
    }

    // copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll_no = s1.roll_no;
    }
}
