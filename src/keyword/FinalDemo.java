package keyword;

//class    it cannot inherit
final class Final{
	//method
	final void m1() {
		System.out.println("i am in Final");
	}
}

public class FinalDemo {

	void m1() {  
		System.out.println("i am in FinalDemo");
	}
	
	public static void main(String[] args) {
		//variable
		final int i = 10;
		System.out.println(i);
		
		FinalDemo f = new FinalDemo();
		f.m1();

	}

}
