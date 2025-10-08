package logical;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter value : ");
			int num = sc.nextInt();
			
			if(num % 2 == 0) {
				System.out.println("num is Even");
			}
			else {
				System.out.println("num is odd");
			}
		}
		

	}

}
