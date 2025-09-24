package multithreading;

class Test extends Thread{
	public void run() {
		Thread.currentThread().setName("Shabaz");
		System.out.println(Thread.currentThread().getName());
		System.out.println("Thread task");
	}
}

public class GetNameDemo {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		Test t = new Test();
		t.start();
		
		//we can print the main thread main
		System.out.println(Thread.currentThread().getName());
		
		//we can change the main thread name
		Thread.currentThread().setName("Roman");
		System.out.println(Thread.currentThread().getName());
		System.out.println(10/0);

	}

}
