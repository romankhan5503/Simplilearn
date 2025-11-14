package java8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class InstantAndFormatting {

	public static void main(String[] args) {
		
		Instant now = Instant.now();
		System.out.println(now);
		
		//Format date to String
		LocalDate date = LocalDate.now();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		String formatted = date.format(f);
		System.out.println(formatted);
		
		//Parse String to Date
		String s = "10-11-2024";
		LocalDate d = LocalDate.parse(s, f);
		System.out.println(d);


	}

}
