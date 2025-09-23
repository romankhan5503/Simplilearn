package string;

public class StringHandling {

	String string;
	
	public StringHandling(String string) {
		this.string = string;
	}
	
	public String toString() {
		//return getClass().getName() + "t" + Integer.toHexString(hashCode());
		//return "hathi";
		return string; //if we want to print string then we have to do this.string = string; this.
	}
	public static void main(String[] args) {
		StringHandling t = new StringHandling("hi");
		StringHandling t1 = new StringHandling("hello");

		String s = "hello";
		String s1  = "hello";
		
		System.out.println(s);
		System.out.println(s1);
		
		System.out.println(s.equals(s1));
		System.out.println(t.equals(t1));
		
		System.out.println(s==s1);
		String s2 = "hello";
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s==s2);
		
		String s4 = new String("hello");
		String s5 = new String("hello");
		
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
		
		System.out.println(s4);
		System.out.println(t);
	}

}
