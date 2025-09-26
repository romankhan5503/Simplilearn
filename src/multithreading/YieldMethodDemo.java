package multithreading;

public class YieldMethodDemo extends Thread {

	public void run() {
		//Thread.yield();
		for(int i = 0; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
		}
	}
	
	public static void main(String[] args) {
		
		YieldMethodDemo ymd = new YieldMethodDemo();
		ymd.start();
		
		Thread.yield(); // if u want main method to stop and provide chance to other threads for execution
		
		for(int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
		}
		

	}

}
