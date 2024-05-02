class MyRunnable implements Runnable {
    public void run() {
        try {
            System.out.println("Thread is going to sleep...");
            Thread.sleep(3000);
            System.out.println("Thread woke up after sleeping for 3 seconds");
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted while sleeping");
        }
    }
}

public class program_2 {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted while waiting for the other thread to finish");
        }

        System.out.println("Main thread continues after joining the other thread.");
    }
}