package java8;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

	
	static void print(String s){
		System.out.println(s);
	}
	public static void main(String[] args) {
		
		//without static 
		MethodReference mcr = new MethodReference();
		
		List<Integer> student = Arrays.asList(1, 2, 3);
		student.forEach(mcr :: hello);
		
		
		
		// we can replace a lambda expression in method reference
		
		List<String> students = Arrays.asList("Roman", "Shabaz", "Arkem");
		students.forEach(MethodReference :: print);
		
		
		

	}

	void hello(Integer i) {
		System.out.println(i);
	}
}
