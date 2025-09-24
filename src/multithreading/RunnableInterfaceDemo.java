package multithreading;

public class RunnableInterfaceDemo implements Runnable{

	public void run() {
		System.out.println("Runnable Interface");
	}
	
	public static void main(String[] args) {
		//in there 2 ways to create
		//1st
		RunnableInterfaceDemo rid = new RunnableInterfaceDemo();
		Thread th = new Thread((rid));
		th.start();
		
		//2nd
		Thread t1 = new Thread(new RunnableInterfaceDemo());
		t1.start();
				

	}

}
