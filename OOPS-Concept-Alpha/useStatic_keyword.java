public class useStatic_keyword {
    public static void main(String[] args) {
        display(); // called directly without using object
    }

    static void display() {
        System.out.println("Static method");
    }
}