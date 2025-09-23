package string;

public class StringCompare {

	public static void main(String[] args) {

		// Using equals() method for case-sensitive comparison
		String s1 = "Roman";
		String s2 = "Khan";
		String s3 = new String("Shabaz");
		String s4 = new String("Roman");
		String s5 = "Roman";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));

		// Using equalsIgnoreCase() method for case-insensitive comparison
		String s6 = "Roman";
		String s7 = "rOMAn";

		System.out.println(s5.equals(s6));
		System.out.println(s6.equalsIgnoreCase(s7));
		System.out.println(s6.equals(s7));

		// By Using == Operator
		String s8 = "Roman";
		String s9 = "Roman";
		String s10 = "Shabaz";
		String str1 = new String("Shabaz");

		System.out.println(s8 == s9);
		System.out.println(s9 == s10);
		System.out.println(s8 == str1); // new object that's y false is giving

		// by compareTo() Method
		/*
		 * Suppose s1 and s2 are two String objects. If:
		 * s1 == s2 : The method returns 0. s1 > s2 : The method returns a positive
		 * value. s1 < s2 : The method returns a negative value.
		 */
		String str2 = "Roman";
		String str3 = "Roman";
		String str4 = "mohd";
		
		System.out.println(str2.compareTo(str3));
		System.out.println(str2.compareTo(str4));
		System.out.println(str4.compareTo(str2));
		
		//Using startsWith() and endsWith() Methods
		String str = "Roman Khan";
		System.out.println(str.startsWith("Roman"));
		System.out.println(str.endsWith("Khan"));
		System.out.println(str.endsWith("mohd"));	
		
	}

}
