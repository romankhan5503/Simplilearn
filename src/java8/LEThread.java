package java8;

public class LEThread {

	public static void main(String[] args) {
		Runnable run = () -> {
			for(int i = 0; i <= 10; i++) {
				System.out.println("Hello " + i);
			}
		};
		Thread childthread = new Thread(run);
		childthread.run();

	}

}
