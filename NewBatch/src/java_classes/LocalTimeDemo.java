package java_classes;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo {

	
	public static void main(String[] args) {
		
		ZoneId zid = ZoneId.of("Australia/Darwin");
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");
		System.out.println(lt.format(dtf));
		
		LocalTime lt1 = LocalTime.of(6, 35);
		System.out.println(lt1);
		
		LocalTime lt2 = LocalTime.now();

		System.out.println(lt1.compareTo(lt));
		
		 
	}
}
