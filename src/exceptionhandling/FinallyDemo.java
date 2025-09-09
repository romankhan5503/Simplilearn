package exceptionhandling;

public class FinallyDemo {

	public static void main(String[] args) {
		try {
			int a = 10, b = 0, c;
			c = a/b;
			System.out.println(c);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Always execute");
		}

		//try without catch 
		try {
			int a = 10, b = 0, c;
			c = a/b;
			System.out.println(c);
		}
		finally{
			System.out.println("I am in Finally block");
		}
		System.out.println("Hello");


	}

}
