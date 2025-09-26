package multithreading;

public class InterruptedDemo2 extends Thread{

	public void run() {
		System.out.println("A : " + Thread.interrupted());  //true -> false
		System.out.println((Thread.currentThread().isInterrupted()));  // true
		try {
			for(int i = 0; i <= 5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
				System.out.println(("B : " + Thread.interrupted()));
			}
		}
		catch(Exception e) {
			System.out.println("Thread interruption : " + e);
		}
	}
	
	public static void main(String[] args) {
		InterruptedDemo2 id2 = new InterruptedDemo2();
		id2.start();
		id2.interrupt();
		

	}

}
