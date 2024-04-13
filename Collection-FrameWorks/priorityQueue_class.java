import java.util.*;

public class priorityQueue_class {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(11);
        pq.offer(12);
        pq.offer(13);
        pq.offer(14);
        pq.offer(15);

        // operation on priority queue
        System.out.println("Priority Queue is " + pq);
        System.out.println("Head of priority queue is " + pq.peek());
        System.out.println("Removed element is " + pq.poll());
        System.out.println("New PQ is " + pq);
        System.out.println("Priority queue contains 13 ... ? " + pq.contains(13));
        System.out.println("Is PQ empty ... ? " + pq.isEmpty());
        System.out.println("Size of priority queue is " + pq.size());
    }
}