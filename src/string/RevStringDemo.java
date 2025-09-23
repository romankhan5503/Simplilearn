package string;

public class RevStringDemo {

	public static void main(String[] args) {
		
		String s = "madam";
		String rev = "";
		String s1 = "Roman";
		String rev1 = "";
		
		for(int i = s.length()-1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		
		if(s.equals(rev)) {
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not a Palindrome String");
		}
		System.out.println(rev);

		//alag hai
		for(int i = s1.length()-1; i >= 0; i--) {
			rev1 = rev1 + s1.charAt(i);
		}
		
		if(s.equals(rev1)) {
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not a Palindrome String");
		}
		System.out.println(rev1);
	}

}
