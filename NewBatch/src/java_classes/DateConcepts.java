package java_classes;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateConcepts {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println(date);
		/*System.out.println(date.getDate());
		System.out.println(date.getMonth());
		date.setMonth(1);
		System.out.println(date);*/
		
	/*	SimpleDateFormat sdf = new SimpleDateFormat("DD-MM-yyyy");
		System.out.println(sdf.format(date));*/
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		System.out.println(lt.plusHours(2));
		System.out.println(lt.format(DateTimeFormatter.ofPattern("DD")));
}

}
