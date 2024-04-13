import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class IdComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getId(), s2.getId());
    }
}

public class comparator_interface {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "John"));
        students.add(new Student(103, "Alice"));
        students.add(new Student(102, "Bob"));

        System.out.println("Before Sorting : ");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, new IdComparator());

        System.out.println("\nAfter Sorting by ID");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}