package practice;

public class String_Demo1 {

	public static void main(java.lang.String[] args) {
		
		String s = "Hello Roman"; 
		String s1 = new String("Hello Java");
		
		System.out.println(s.length());
		System.out.println(s1.length());
		
		System.out.println(s.toUpperCase());
		System.out.println(s1.toUpperCase());

		System.out.println(s.toLowerCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s.charAt(6));
		System.out.println(s1.charAt(7));
		
		System.out.println(s.substring(5, 11));
		System.out.println(s1.substring(4, 10));
		
		System.out.println(s.contains("Java"));
		System.out.println(s1.contains("Java"));
		
		System.out.println(s.replace("Hello", "Hey"));
		System.out.println(s1.replace("Java", "Shabaz"));

	}

}
