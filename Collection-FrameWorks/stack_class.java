import java.util.Stack;

public class stack_class {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("C");
        stack.push("Python");
        stack.push("Java");
        stack.push("JavaScript");

        System.out.println("->Stack elements are " + stack);
        System.out.println("->Top element of stack is " + stack.peek());
        System.out.println("->Use of pop to remove top and print it => " + stack.pop());
        System.out.println("->After popping stack is " + stack);
        System.out.println("Is stack empty ..? " + stack.isEmpty());

        // search string in stack
        System.out.println("\n->Using search method to check 'JavaScript' exist or not..?");
        int index = stack.search("JavaScript");
        if (index != -1) {
            System.out.println("->JavaScript is found at index " + index);
        } else {
            System.out.println("->JavaScript is not present in stack");
        }
    }
}