package multithreading;

class Medical extends Thread{
	
	public void run() {
		try {
			System.out.println("Medical starts");
			Thread.sleep(5000);
			System.out.println("Medical completed");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

class TestDriver extends Thread{
	
	public void run() {
		try {
			System.out.println("Test Drive starts");
			Thread.sleep(4000);
			System.out.println("Test Drive completed");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

class OfficerSign extends Thread{
	
	public void run() {
		try {
			System.out.println("Officer takes the file");
			Thread.sleep(3000);
			System.out.println("Officer works completed");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

public class LicenseDemo {

	public static void main(String[] args) throws InterruptedException {
		Medical m = new Medical();
		m.start();
		m.join();

		TestDriver td = new TestDriver();
		td.start();
		td.join();
		
		OfficerSign os = new OfficerSign();
		os.start();
		
	}

}
