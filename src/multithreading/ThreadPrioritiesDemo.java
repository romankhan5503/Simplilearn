package multithreading;

class Test2 extends Thread{
	public void run() {
		System.out.println("child thread");
		System.out.println(Thread.currentThread().getPriority());
	}
}

public class ThreadPrioritiesDemo {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		
		Test2 t2 = new Test2();
		t2.start();

	}

}
