package exceptionhandling;

public class ExceptionInfo {

	public static void main(String[] args) {
		try {
			int a = 10, b = 0, c;
			c = a/b;
			System.out.println(c);
		}
		catch (ArithmeticException e) {
		
//			e.printStackTrace();
			System.out.println(e);
//			System.out.println(e.toString());
//			System.out.println(e.getMessage());
		}


	}

}
