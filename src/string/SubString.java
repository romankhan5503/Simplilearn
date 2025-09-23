package string;

import java.util.*;

public class SubString {

	public static void main(String[] args) {
		String s = "Roman Khan";
		System.out.println(s.substring(2,s.length()));

		//Using String.split() method:
		String text = new String("My name is Roman");
		
		String[] sentence = text.split("\\.");
		System.out.println(Arrays.toString(sentence));
		
		
		
	}

}
