import java.util.Vector;

public class vector_class {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("Apple");
        v.add("Banana");
        v.add("Kiwi");
        v.add("Orange");
        System.out.println("Vector class is " + v);
        System.out.println("Original size is " + v.size());

        v.add("Watermelon");
        v.add("Grapes");

        System.out.println("New vector is " + v);
        System.out.println("New size is " + v.size());
    }
}