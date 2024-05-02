class Counter implements Runnable {
    private Integer sum = 0;

    public void run() {
        for (int i = 0; i < 10000; i++) {
            sum++;
        }
    }

    public Integer getSum() {
        return sum;
    }
}

class CounterSync implements Runnable {
    private Integer sum = 0;

    public synchronized void run() {
        for (int i = 0; i < 10000; i++) {
            sum++;
        }
    }

    public Integer getSum() {
        return sum;
    }
}

public class program_3 {
    public static void main(String[] args) {
        System.out.println("Without Synchronization:");
        Counter counter1 = new Counter();

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(counter1);
            thread.start();
        }

        try {
            Thread.sleep(1000); // Wait for all threads to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final sum without synchronization: " + counter1.getSum());

        System.out.println("\nWith Synchronization:");
        CounterSync counter2 = new CounterSync();

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(counter2);
            thread.start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final sum with synchronization: " + counter2.getSum());
    }
}