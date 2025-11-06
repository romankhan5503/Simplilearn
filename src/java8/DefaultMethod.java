package java8;

interface A{
	 
	 default void disp() {
		 System.out.println("A in default");
	 }
}

interface B{
	 
	 default void disp() {
		 System.out.println("B in default");
	 }
}

public class DefaultMethod implements A, B{

	public static void main(String[] args) {
		DefaultMethod dm = new DefaultMethod();
		dm.disp();
	}

	@Override
	public void disp() {
		A.super.disp();
		B.super.disp();
	}

}
