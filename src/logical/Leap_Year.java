package logical;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter Year : ");
			int year = sc.nextInt();

//			if (year % 4 == 0) {
//				if (year % 100 == 0) {
//					if (year % 400 == 0) {
//						System.out.println("Leap Year");
//					} else {
//						System.out.println("Not a Leap Year");
//					}
//				} else {
//					System.out.println("Leap Year");
//				}
//			} else {
//				System.out.println("Its not a leap Year");
//			}
//		}

		//another way
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not a Leap Year");
			}
		}
		
	}

}
