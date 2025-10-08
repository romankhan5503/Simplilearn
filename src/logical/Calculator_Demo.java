package logical;

import java.util.Scanner;

public class Calculator_Demo {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Enter value no1 : ");
			int no1 = sc.nextInt();
			
			System.out.println("Enter value no2 : ");
			int no2 = sc.nextInt();
			
			System.out.println("Enter Symbol : ");
			String sym = sc.next();
			
			int res; 
			
			switch(sym) {
			case "+" : res = no1 + no2;
			System.out.println(res);
			break;
			
			case "-" : res = no1 - no2;
			System.out.println(res);
			break;
			
			case "*" : res = no1 * no2;
			System.out.println(res);
			break;
			
			case "/" : res = no1 / no2;
			System.out.println(res);
			break;
			
			default:
				System.out.println("invalid symbol");
				break;
			}
		}

	}

}
