package deepakCollection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>();
		
		//adding elements
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Apple");   // duplicate allowed
		
		// Accessing elements by index
		System.out.println("First elements : " + fruits.get(0));
		
		// Iterating using for-each loop
		System.out.println("List elemts : ");
		for(String fruit : fruits) {
			System.out.println(fruit);
		}

		//remove element
		fruits.remove("Banana");
		System.out.println("After removing Banana: " + fruits);
	}

}
