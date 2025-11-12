package java8;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> bip = (x, y) -> x % 2 == 0 && y % 2 == 0;
		System.out.println(bip.test(4, 5));
		System.out.println(bip.test(4, 6));
		
		BiPredicate<String, Integer> bipredicate = (str, x) -> str.length() == x;
		System.out.println(bipredicate.test("vipul", 5));
		System.out.println(bipredicate.test("Roman", 6));
	}
}
