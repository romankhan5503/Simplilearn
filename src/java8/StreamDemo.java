package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 16, 27, 15, 25, 30);
		
		//without stream
		for(Integer n : numbers) {
			if(n % 2 == 0) {
				System.out.println(n);
			}
		}
		
		//with stream
		numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

		//1. Stream Creation Methods
		//From a List
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8);
		Stream<Integer> s = num.stream();
		
		//From an Array
		Stream<Integer> so = Arrays.stream(new Integer[] {1,2,3,4});
		
		//Using Stream.of()
		Stream<String> soo = Stream.of("A","B","C");
		
		
		//2. Intermediate Operations (return Stream)
		//filter
		num.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		
		//map
		num.stream().map(n -> n * n).forEach(System.out::println);
		
		//sorted
		num.stream().sorted().forEach(System.out::println);
		
	    num.stream().sorted((a, b) -> b -a).forEach(System.out::println);
	    
	    //distinct
	    num.stream().distinct().forEach(System.out::println);
	    
	    //limit
	    num.stream().limit(7).forEach(System.out::println);
	    
	    //skip
	    num.stream().skip(2).forEach(System.out::println);
	    
	    //peek
	    num.stream().peek(n -> System.out.println("Valye: " + n)).map(n -> n * 2).forEach(System.out::println);
	    
	    //3. Terminal Operations (end the stream)
	    //foreach
	    num.stream().forEach(System.out::println);
	    
	    //collect
	    List<Integer> newList = num.stream().filter(n -> n > 10).collect(Collectors.toList());
	    
	    //toArray
	    Integer[] arr = num.stream().toArray(Integer[]::new);
	    
	    
		
	}

}
