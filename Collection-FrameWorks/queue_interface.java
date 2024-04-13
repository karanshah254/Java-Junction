import java.util.LinkedList;
import java.util.Queue;

public class queue_interface {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // adds element in queue
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Mango");
        queue.offer("Orange");

        // different methods in queue...
        System.out.println("Queue element are " + queue);
        System.out.println("Head of queue is " + queue.peek());
        System.out.println("Removed element is " + queue.poll());
        System.out.println("Now queue is " + queue);
        System.out.println("Is queue empty ..? " + queue.isEmpty());
        System.out.println("Size of new queue is " + queue.size());
    }
}