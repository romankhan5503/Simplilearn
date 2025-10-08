package logical;

import java.util.Scanner;

public class Greater_Three {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter value of a: ");
			int a = sc.nextInt();

			System.out.print("Enter value of b: ");
			int b = sc.nextInt();

			System.out.print("Enter value of c: ");
			int c = sc.nextInt();

			if (a > b) {
				System.out.println("a is greater then b");
			} else if (a > c) {
				System.out.println("a is greater then c");
			} else if (b > a) {
				System.out.println("b is greater then a");
			} else if (b > c) {
				System.out.println("b is greater then c");
			} else if (c > a) {
				System.out.println("c is greater then b");
			} else if (c > b) {
				System.out.println("c is gretaer then b");
			} else {
				System.out.println("no one is greater");
			}

			// Other way
			if (a > b && a > c) {
				System.out.println("a is greater");
			} else if (b > a && b > c) {
				System.out.println("b is greater");
			} else {
				System.out.println("c is greater");
			}

			// another way
			if (a > b) {
				if (a > c) {
					System.out.println("a is greater");
				} else {
					System.out.println("c is greater");
				}
			} else if (b > c) {
				System.out.println("b is greater");
			} else {
				System.out.println("c is greater");
			}
		}

        // greater four
		int d = 70, e = 50, f = 30, g = 90;
		if (d > e && d > f && d > g) {
			System.out.println("d is greater");
		} else if (e > d && e > f && e > g) {
			System.out.println("e is greater");
		} else if (f > d && f > e && f > g) {
			System.out.println("f is greater");
		} else {
			System.out.println("g is greater");
		}
	}

}
