import java.util.concurrent.*;
class MyTask implements Runnable {
    private String name;

    public MyTask(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " is running on thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " completed");
    }
}

public class program_5 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            Runnable task = new MyTask("Task " + i);
            executor.submit(task);
        }

        executor.shutdown();
    }
}