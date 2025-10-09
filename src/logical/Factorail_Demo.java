package logical;

import java.util.Scanner;

public class Factorail_Demo {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a value : ");
			int no = sc.nextInt();
			
			System.out.println("Enter a factorial value : ");
			int fact = sc.nextInt();
			
			
			for(int i = 1; i <= no; i++) {
				fact = fact * i;
			}
			System.out.println(fact);

			
			for(int i = no; i >= 1; i--) {
				fact = fact * i;
			}
			System.out.println(fact);
			
			
		}
		}
		
	}


