package logical;

import java.util.Scanner;

public class Scanner_Demo {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Enter Your Name : ");
			String name = sc.nextLine();
			
			System.out.println("Enter Your Gender : ");
			char gender = sc.next().charAt(0);
			
			System.out.println("Enter Your Age : ");
			int age = sc.nextInt();
			
			System.out.println("Enter Your Phone_Number : ");
			long ph_no = sc.nextLong();
			
			System.out.println("==============================");
			System.out.println("Your Name is : " + name);
			System.out.println("==============================");
			System.out.println("Your Gender is : " + gender);
			System.out.println("==============================");
			System.out.println("Your Age is : " + age);
			System.out.println("==============================");
			System.out.println("Your Phone_Number is : " + ph_no);
		}

	}

}
