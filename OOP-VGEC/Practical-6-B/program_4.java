class MyRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority());

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class program_4 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        thread1.setPriority(Thread.MAX_PRIORITY);
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");
        thread2.setPriority(Thread.NORM_PRIORITY);
        Thread thread3 = new Thread(new MyRunnable(), "Thread 3");
        thread3.setPriority(Thread.MIN_PRIORITY);
        Thread thread4 = new Thread(new MyRunnable(), "Thread 4");
        thread4.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}