package java8;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer,Integer> sq = n -> n * n;
		
		System.out.println(sq.apply(6));
		
		//with String
		Function<String, Integer> lengthFinder = str -> str.length();
		System.out.println(lengthFinder.apply("Roman"));
		System.out.println(lengthFinder.apply("Shabaz"));

		//function chaining
		//andthen
		Function<Integer, Integer> multiply = n -> n * 2;
		Function<Integer, Integer> square = n -> n * n;
		Function<Integer, Integer> result = multiply.andThen(square);
		Function<Integer, Integer> result2 = square.andThen(multiply);
		System.out.println(result.apply(3));
		System.out.println(result2.apply(4));
		
		//compose (me pahle square hoga phir multiply)
		Function<Integer, Integer> result3 = multiply.compose(square);
		Function<Integer, Integer> result4 = square.compose(multiply);
		System.out.println(result3.apply(4));
		System.out.println(result4.apply(5));
		
		//identity
		Function<String, String> s = Function.identity();
		System.out.println(s.apply("Roman"));
	}

}
