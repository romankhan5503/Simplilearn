package logical;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		//with third variable
//		try(Scanner sc = new Scanner(System.in)){
//			
//			System.out.println("Enter value of a : ");
//			int a = sc.nextInt();
//			
//			System.out.println("Enter value of b : ");
//			int b = sc.nextInt();
//			
//			int t;
//			t = a;
//			a = b;
//			b = t;
//			
//			System.out.println("a : " + a);
//			System.out.println("b : " + b);
//		}

		//without third variable
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Enter value of a : ");
			int a = sc.nextInt();
			
			System.out.println("Enter value of b : ");
			int b = sc.nextInt();
			
			a = a + b;
			b = a - b;
			a = a - b;
			
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			
		}
	}

}
