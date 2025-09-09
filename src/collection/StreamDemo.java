package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> numbersList = new ArrayList<>();
		numbersList.add(10);
		numbersList.add(20);
		numbersList.add(30);
		numbersList.add(40);
		
		List<Integer> squresList = new ArrayList<>();
		for(Integer i : numbersList) {
			squresList.add(i*i);
		}
		
		List<Integer> squresList1 = numbersList.stream().map(x -> x*x).
				collect(Collectors.toList());
		System.out.println("List of squared numbers: " + squresList);
		
		Set<Integer> squaresSet = new HashSet<>();
		for(Integer i : numbersList) {
			squresList.add(i*i);
		}
		
		Set<Integer> squareSet = 
				numbersList.stream().map(x -> x*x).collect(Collectors.toSet());
		
		List<String> languages = new ArrayList<>();
		languages.add("java");
		languages.add("python");
		languages.add("scala");
		
		List<String> filterResult = new ArrayList<>();
		for(String s: filterResult) {
			if(s.startsWith("p")) {
				filterResult.add(s);
			}
		}
		
		List<String> filterResult1 = languages.stream().filter(s -> s.startsWith("p")).
				collect(Collectors.toList());
		System.out.println("Languages starting with 'p': " + filterResult1);
		
		List<String> sortedList = 
				languages.stream().sorted().collect(Collectors.toList());
		System.out.println("Languages sorted alphabetically: " + sortedList);
		
		//demonstration of forEach method
		System.out.println("Printing all elements one by one: ");
		numbersList.stream().map(x -> x*x).forEach(y -> System.out.println("Element is: " + y));
		
		//demonstration of reduce method
		int sum = numbersList.stream().reduce(0, (ans,i) -> ans+i);	
		
		System.out.println("sum of all elements in the numberList: " + sum);
		
	}

}
