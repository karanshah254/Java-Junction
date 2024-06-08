public class thread_creation extends Thread {
    public void run() {
        int a = 10, b = 5;
        int result = a + b;
        System.out.println("Thread is running");
        System.out.println("Sum of two numbers is " + result);
    }

    public static void main(String[] args) {
        thread_creation t1 = new thread_creation();
        t1.start();
    }
}