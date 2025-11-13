package java8;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinary {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> uo = x -> x * x;
		System.out.println(uo.apply(5));
		
		UnaryOperator<String> uo2 = str -> str.toLowerCase();
		System.out.println(uo2.apply("Roman"));
		
		BinaryOperator<String> bo= (str, str2) -> str + str2;
		System.out.println(bo.apply("Hello", " Roman"));

	}

}
