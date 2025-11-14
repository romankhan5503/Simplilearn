package java8;

import java.time.LocalDate;

public class LocalDateDemo {

	public static void main(String[] args) {
		// today;s date
		LocalDate now = LocalDate.now();
		System.out.println(now);

		// custom date
		LocalDate dob = LocalDate.of(2004, 05, 05);
		System.out.println(dob);

		// year, month, date
		System.out.println(dob.getYear());
		System.out.println(dob.getMonth());
		System.out.println(dob.getDayOfMonth());
		System.out.println(dob.getDayOfWeek());
		System.out.println(dob.getDayOfYear());

		// add/subtract days or month
		LocalDate newDate = dob.plusDays(5);
		LocalDate oldDate = dob.minusDays(3);
		System.out.println(newDate);
		System.out.println(oldDate);

	}

}
