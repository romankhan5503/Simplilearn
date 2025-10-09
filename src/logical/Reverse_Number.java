package logical;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number : ");
			int no = sc.nextInt();
			int rem, reverse = 0;
			
			while(no != 0) {
				rem = no % 10;
				reverse = reverse * 10 + rem;
				no = no/10;
			}
			System.out.println(reverse); 
		}
		
		

	}

}
