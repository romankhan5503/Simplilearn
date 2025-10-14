package logical;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 1st no : ");
		int no1 = sc.nextInt();
		
//		System.out.println("enter 2nd no : ");
//		double no2 = sc.nextDouble();
//		
//		System.out.println("enter symbol");
//		String sym = sc.next();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(no1 + " x " + i + " = " + no1 *i);
		}
		
		
		
		
	}
}
