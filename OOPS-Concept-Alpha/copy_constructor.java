public class copy_constructor {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "Karan";
        s1.marks[0] = 100;
        s1.marks[1] = 80;
        s1.marks[2] = 78;

        Student1 s2 = new Student1(s1);
        s1.marks[2] = 88;
        for (int i = 0; i < 3; i++) {
            System.out.print(s2.marks[i] + " ");
        }

    }
}

class Student1 {
    int marks[];
    String name;

    Student1() {
        marks = new int[3];
        System.out.println("default constructor is called");
    }

    Student1(String name) {
        this.name = name;
    }

    // deep constructor
    Student1(Student1 s1) {
        marks = new int[3];
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
