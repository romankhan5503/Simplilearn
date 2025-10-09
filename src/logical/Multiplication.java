package logical;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a value : ");
			int no = sc.nextInt();
			
			for(int i = 1; i <= 10; i++) {
				//System.out.println(no * i);
				System.out.println(no + " x " + i + " = " + no * i);
			}
		}

	}

}
