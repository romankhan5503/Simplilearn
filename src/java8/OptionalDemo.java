package java8;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		//✅ 1. Creating Optional
		//Optional with value
		Optional<String> op = Optional.of("Hello");

		//Optional that may be null
		Optional<String> op2 = Optional.ofNullable(null);
		
		//Empty optional
		Optional<String> op3 = Optional.empty();
		
		
		//✅ 2. Check if value is present
		//isPresent
		System.out.println(op.isPresent());
		System.out.println(op.isEmpty());
		
		//✅ 3. Get value safely
		System.out.println(op.get());
		
		//✅ 4. orElse() → return default value
		String name = op.orElse("defaut");
		System.out.println(name);
		
		//✅ 5. orElseGet() → returns value using lambda
		String name2 =  op.orElseGet(() -> "general default");
		System.out.println(name2);
		
		//✅ 6. orElseThrow() → throw custom exception
		String name3 = op.orElseThrow(() -> new RuntimeException("value misssing"));
		System.out.println(name3);
		
		//✅ 7. ifPresent() → run only if value exists
		op.ifPresent(val -> System.out.println("value = " + val));
		
		//✅ 8. map() inside Optional
		Optional<String> op1 = Optional.of("map");

		Optional<String> upper = op1.map(s -> s.toUpperCase());
		System.out.println(upper.get());  // HELLO

		//✅ 9. flatMap() (for nested Optional)
		Optional<Optional<String>> nested = Optional.of(Optional.of("Hi"));

		Optional<String> flat = nested.flatMap(v -> v);
		System.out.println(flat.get());

	}

}
