package java8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class DateAndTime {

	public static void main(String[] args) {
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		//Custom LocalDateTime
		LocalDateTime dt2 = LocalDateTime.of(2024, 11, 5, 10, 30);
		System.out.println(dt2);
		
		//UTC = universal time coordinate
		
		
		//ZonedDateTime
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		//specific zdt
		ZonedDateTime india = ZonedDateTime.now(ZoneId.of("Asia/Calcutta"));
		System.out.println(india);
		
		Set<String> available = ZoneId.getAvailableZoneIds();
		available.forEach(System.out::println);
	}

}
