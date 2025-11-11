package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {

	public static void main(String[] args) {
		Predicate<Integer> pred = x -> x > 100000;
		System.out.println(pred.test(10000));

		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int sum = num.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum();
		System.out.println(sum);

		// predicates with string
		Predicate<String> isLong = s -> s.length() > 5;
		System.out.println(isLong.test("Roman"));
		System.out.println(isLong.test("Shabaz"));
		
		Predicate<String> startsWithLetterR = x -> x.toLowerCase().charAt(0) == 'r';
		Predicate<String> endsWithLetterN = x -> x.toLowerCase().charAt(x.length() - 1) == 'n';
		Predicate<String> and = startsWithLetterR.and(endsWithLetterN);
		System.out.println(startsWithLetterR.test("Roman"));
		System.out.println(endsWithLetterN.test("Arkem"));

	}

}
