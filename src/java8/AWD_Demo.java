package java8;

interface Aa{
	void greet();
	
	default void show() {
		System.out.println("Default metthod 1 in A");
	}
	
	default void disp() {
		System.out.println("Default metthod 1 in A");
	}
}

interface Bb{
	void Message();
	
	default void show() {
		System.out.println("Default metthod 2 in B");
	}
	
	default void disp() {
		System.out.println("Default metthod 2 in B");
	}
}

class C implements Aa, Bb{

	@Override
	public void Message() {
		System.out.println("I have a message for u");
		
	}

	@Override
	public void greet() {
		System.out.println("I am greeting u");
		
	}

	@Override
	public void show() {
		Aa.super.show();
	}

	@Override
	public void disp() {
		Bb.super.disp();
	}
	
}

public class AWD_Demo {

	public static void main(String[] args) {
		C c = new C();
		c.greet();
		c.show();
		c.disp();
		c.Message();

	}

}
