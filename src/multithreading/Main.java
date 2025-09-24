package multithreading;

class Thread1 extends Thread{
	public void run() {
		System.out.println("Music controller");
	}
}

class Thread2 extends Thread{
	public void run() {
		System.out.println("Pause/Play controller");
	}
}

class Thread3 extends Thread{
	public void run() {
		System.out.println("Time controller");
	}
}

public class Main {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();
		
		Thread2 t2 = new Thread2();
		t2.start();
		
		Thread3 t3 = new Thread3();
		t3.start();

	}

}
