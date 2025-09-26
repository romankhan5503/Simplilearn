package multithreading;

//isme main thread wait karega child thread ke execute hone tak

public class JoinMethodDemo extends Thread {

	public void run() {
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Child Thread : " + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		JoinMethodDemo jmd = new JoinMethodDemo();
		jmd.start();
		jmd.join();
		
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Main Thread : " + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
