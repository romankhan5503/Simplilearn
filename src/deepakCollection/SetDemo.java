package deepakCollection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();

		// adding elements
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Apple"); // duplicate ignored

		// Iterating using for-each loop
		System.out.println("List elemts : ");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		// remove element
		fruits.remove("Banana");
		System.out.println("After removing Banana: " + fruits);
	}

}
