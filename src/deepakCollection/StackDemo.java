package deepakCollection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Object> s = new Stack<Object>();
		s.push("Deepak");
		s.push("Amit");
		s.push(101);
		s.push(101.4);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.search("Deepak"));
		System.out.println(s);

	}

}
