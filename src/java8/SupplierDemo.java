package java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<Integer> supplier = () -> 10;
		System.out.println(supplier.get());
		
		Predicate<Integer> predicate = x -> x % 2 == 0;
		System.out.println(predicate.test(5));
		
		Function<Integer, Integer> function = x -> x * x;
		System.out.println(function.apply(4));
		
		Consumer<Integer> consumer = x -> System.out.println(x);
		consumer.accept(10);
		
		Supplier<Integer> supplier2 = () -> 100;
		System.out.println(supplier2.get());
		
		if(predicate.test(supplier2.get())) {
			consumer.accept(function.apply(supplier2.get()));
		}
		
		
		

	}

}
