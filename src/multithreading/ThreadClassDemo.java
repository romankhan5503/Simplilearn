package multithreading;

public class ThreadClassDemo extends Thread{

	public void run() {
		System.out.println("Thread Class");
	}
	
	public static void main(String[] args) {
		ThreadClassDemo tcd = new ThreadClassDemo();
		tcd.start();
		tcd.start(); //throw exception

	}

}
