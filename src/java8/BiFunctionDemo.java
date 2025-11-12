package java8;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		
		BiFunction<String, String, Integer> bif = (x, y) -> x.length() + y.length();
		System.out.println(bif.apply("Hello", "Roman"));
		
		BiFunction<String, String, String> bifu = (first, last) -> first +" " + last;
		System.out.println(bifu.apply("Roman", "Khan"));
		

	}

}
