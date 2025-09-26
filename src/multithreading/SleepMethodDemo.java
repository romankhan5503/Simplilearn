package multithreading;

//in this class we had to surround sleep method with try-catch
class MyThread extends Thread{
	public void run() {
		for(int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}

//in this we can use throws and try-cath as we wish
public class SleepMethodDemo {

	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i <= 5; i++) {
			Thread.sleep(500);
			System.out.println(i);
		}
		MyThread mt = new MyThread();
		mt.start();

	}

}
