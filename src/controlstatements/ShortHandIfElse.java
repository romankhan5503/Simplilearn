package controlstatements;

public class ShortHandIfElse {

	public static void main(String[] args) {
		int time = 10; 
		
		String number = (time > 9) ? "you arrive right time" : "sorry! you are late";
		System.out.println(number);
		
		//new exapmle
		int mrk = 40;
		
		String num = (mrk <30) ? "greater then" : "less then";
		System.out.println(num);

	}

}

//it also known as ternary operator. it can be used to replace  multiple line of code in a single line

