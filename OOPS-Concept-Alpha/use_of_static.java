public class use_of_static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "Aone";

        Student s2 = new Student();
        // System.out.println(s2.schoolName); // prints Aone

        Student s3 = new Student();
        s3.schoolName = "Rhk";
        System.out.println(s3.schoolName);
        System.out.println(s2.schoolName); // changes to Rhk

        s1.setName("Karan");
        System.out.println(s1.getName());

        System.out.println("Percentage of student s1 is " + s1.findPercentage(50, 60, 70));
    }
}

class Student {
    String name;
    int roll_no;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    // format of finding percentage is same for all students
    static int findPercentage(int math, int chem, int phy) {
        return (math + chem + phy) / 3;
    }
}