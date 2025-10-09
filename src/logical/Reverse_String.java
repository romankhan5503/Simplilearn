package logical;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter name : ");
			String name = sc.nextLine();
			
			int lang = name.length();
			String reverse = "";
			
			for(int i = lang - 1; i >= 0; i--) {
				reverse = reverse + name.charAt(i);  
			}
			System.out.println(reverse);
		}
		

	}

}
