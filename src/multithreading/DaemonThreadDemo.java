package multithreading;

class Test1 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("daemon Thread");
	}
}

public class DaemonThreadDemo {

	public static void main(String[] args) {
		
		System.out.println("Main Thread");
		
		Test1 t = new Test1();
		t.setDaemon(true);
		t.start();

	}

}
