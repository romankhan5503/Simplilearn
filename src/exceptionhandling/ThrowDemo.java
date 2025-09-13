package exceptionhandling;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter yoyr age: ");
		int age = sc.nextInt();
		
		if(age < 18) {
			 throw new ArithmeticException("Age must be at least 18");
		} else {
			System.out.println("Welcome!");
		}
	}
	
}