package java8;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		//custom time
		LocalTime t = LocalTime.of(10, 45, 30);
		System.out.println(t);
		
		//plus/minus
		System.out.println(time.plusHours(2));
		System.out.println(time.minusHours(1));
		System.out.println(time.minusMinutes(30));
		

	}

}
