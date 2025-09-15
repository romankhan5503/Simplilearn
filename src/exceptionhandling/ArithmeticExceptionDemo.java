package exceptionhandling;
import java.io.FileInputStream;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		
		try {
			FileInputStream fi = new FileInputStream("C:\\Users\\roman\\OneDrive\\Desktop");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			int a = 10, b = 0, c;
			c = a/b;
			System.out.println(c);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		//it can't go on catch block because it doesn't find any exception
		System.out.println("1");
		try {
			System.out.println("2");
			int a = 10, b = 2, c;
			System.out.println("3");
			c = a/b;
			System.out.println("4");
			System.out.println(c);  
			System.out.println("5");
		}
		catch (ArithmeticException e) {
			System.out.println("6");
			System.out.println(e);
			System.out.println("7");
		}
		System.out.println("8");

	}

}
