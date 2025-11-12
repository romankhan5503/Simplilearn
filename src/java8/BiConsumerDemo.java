package java8;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> sum = (a, b) -> {
			System.out.println(a + b);
		};
		sum.accept(10, 20);

	}

}
