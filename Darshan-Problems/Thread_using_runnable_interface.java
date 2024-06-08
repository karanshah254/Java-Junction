public class Thread_using_runnable_interface implements Runnable {
    public void run() {
        System.out.println("Thread is ended");
    }

    public static void main(String[] args) {
        Thread_using_runnable_interface thread = new Thread_using_runnable_interface();
        Thread t1 = new Thread(thread);
        t1.start();
        System.out.println("Hi!");
    }
}
