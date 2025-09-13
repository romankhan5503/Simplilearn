package controlstatements;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<String> languages = new ArrayList<>();
		languages.add("basics");
		languages.add("java");
		languages.add("python");
		languages.add("scala");
		
		List<String> sortedList = 
				languages.stream().sorted().collect(Collectors.toList());
		System.out.println("Languages sorted alphabetically: " + sortedList);

		//demonstration of forEach method
				System.out.println("Printing all elements one by one: ");
				languages.stream().forEach(y -> System.out.println("Element is: " + y));
	}

}
