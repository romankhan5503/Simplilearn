package collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();

		stack.push("Amrica");
		stack.push("Germany");
		stack.push("India");
		
		System.out.println("Stack: " + stack);
		
		String poopedElement = stack.pop();
		System.out.println("popped element: " + poopedElement);
		
		System.out.println("Now the stack looks like: " + stack);
		
		String poopedElement1 = stack.pop();
		System.out.println("popped element: " + poopedElement1);
		
		System.out.println("Now the stack looks like: " + stack);
		
		String poopedElement11 = stack.pop();
		System.out.println("popped element: " + poopedElement11);
		
		System.out.println("Now the stack looks like: " + stack);
	}
	

}
