package java_classes;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {

	
	public static void main(String[] args) {
		
		ZoneId z = ZoneId.of("America/Phoenix");
		LocalDate date = LocalDate.now(z);
		System.out.println(date);
		System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		
		LocalDate date1 =LocalDate.of(2010, 01, 01);
		
		System.out.println(date1.plusMonths(5));
		
		
	}
}

