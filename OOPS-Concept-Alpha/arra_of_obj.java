class Array {
    String name;
    int roll_no;

    public Array(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public void display() {
        System.out.println("| " + roll_no + " | -- | " + name + " |");
    }
}

public class arra_of_obj {
    public static void main(String[] args) {
        // array of an object
        Array[] student = new Array[4];
        student[0] = new Array("Karan Shah", 124);
        student[1] = new Array("Kavan Joshi", 125);
        student[2] = new Array("John Doe", 126);
        student[3] = new Array("Carl Johnson", 127);

        // display details | roll_no | -- | name |
        student[0].display();
        student[1].display();
        student[2].display();
        student[3].display();
    }
}