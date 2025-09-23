package string;

import java.util.*;  
import java.util.stream.Collectors;    

public class StringConcatenation {

	public static void main(String[] args) {
		
		//Using the + Operator
		String s = "Roman" + " Khan";
		System.out.println(s);
		
		//Using the String.concat() Method
		String s1 = "Roman";
		String s2 = " Khan";
		System.out.println(s1.concat(s2));

		 //Using String.join() Method
		String firstName = "Roman";
		String lastName = " Khan";
		String result = String.join("","Hello, ", firstName, lastName);
		System.out.println(result);
		
		//Using the String.format() Method
		String FirstName = "Roman";
		String LastName = " Khan";
		String res = String.format("Hello, %s%s", FirstName, LastName);
		System.out.println(res);
		
		//Using Collectors.joining() Method (Java 8 and above versions)
		 List<String> liststr = Arrays.asList("abc", "pqr", "xyz"); //List of String array  
		    String str = liststr.stream().collect(Collectors.joining(", ")); //performs joining operation  
		        System.out.println(str.toString());  //Displays result  
		
		
	}

}
