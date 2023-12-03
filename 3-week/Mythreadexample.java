package practitce;
public class Mythreadexample extends Thread{
	    public void run() {
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Thread: " + Thread.currentThread().getId() + " Count: " + i);
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                System.out.println("Thread interrupted");
	            }
	        }
	    }
    public static void main(String[] args) {
	        MyThread thread1 = new MyThread();
	        Mythreadexample thread2 = new Mythreadexample();
	        thread1.start();
	        thread2.start();
	    }
	}
