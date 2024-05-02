class MyThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread is going to sleep");
            Thread.sleep(3000);
            System.out.println("Thread woke after sleeping for 3 seconds");
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted while sleeping");
        }
    }
}

public class program_1 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}