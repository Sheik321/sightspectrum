package practitce;
class MyThread extends Thread {
    public void run() {
        System.out.println("This is a thread running!");
    }
}
public class MultithreadingDemo {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); 
  Thread anonymousThread = new Thread(() -> {
            System.out.println("This is an anonymous thread running!");
        });
        anonymousThread.start(); 
        Runnable myRunnable = () -> {
            System.out.println("This is a Runnable thread running!");
        };
        Thread runnableThread = new Thread(myRunnable);
        runnableThread.start();
    }
}