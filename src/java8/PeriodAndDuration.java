package java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PeriodAndDuration {

	public static void main(String[] args) {
		
		//Difference between 2 dates → Years/Months/Days
		
		LocalDate d1 = LocalDate.of(2020, 1, 1);
		LocalDate d2 = LocalDate.now();
		System.out.println(d1);
		System.out.println(d2);

		Period p = Period.between(d1, d2);

		System.out.println(p.getYears());
		System.out.println(p.getMonths());
		System.out.println(p.getDays());

		//Difference between 2 times → Hours/Minutes/Seconds
		
		LocalTime t1 = LocalTime.of(10, 0);
		LocalTime t2 = LocalTime.of(12, 30);
		System.out.println(t1);
		System.out.println(t2);

		Duration d = Duration.between(t1, t2);
		System.out.println(d.toHours());   // 2
		System.out.println(d.toMinutes()); // 150
		
		//using both
		LocalDateTime dt = LocalDateTime.of(2004, 05, 05, 12, 5);
		LocalDateTime dt2 = LocalDateTime.of(2007, 07, 25, 10, 4);
		
		Period pe = Period.between(dt.toLocalDate(), dt2.toLocalDate());
		
		Duration du = Duration.between(dt.toLocalTime(), dt2.toLocalTime());

		System.out.println("Period → " + pe.getYears() + " Years, " 
                + pe.getMonths() + " Months, " 
                + pe.getDays() + " Days");

System.out.println("Duration → " + du.toHours() + " Hours, "
                + du.toMinutesPart() + " Minutes");

	}

}
