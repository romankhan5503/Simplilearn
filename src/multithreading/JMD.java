package multithreading;

//isme child thread wait karega main thread ke execute hone tak

public class JMD extends Thread{

	static Thread t;
	
	public void run() {
		try {
		    t.join();
			for(int i = 0; i <= 5; i++) {
				System.out.println("Child Thread : " + i);
				Thread.sleep(1000);
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
		t = Thread.currentThread();
		JMD j = new JMD();
		j.start();

		try {
			for(int i = 0; i <= 5; i++) {
				System.out.println("Main Thread : " + i);
				Thread.sleep(1000);
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
	}

}
