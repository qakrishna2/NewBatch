package java_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("Automation");
		list.add("Selenium");
		list.add("Automation");
		list.add(1, "TestNg");
		
		
	//Strings
		
		String[] strings = {"asd","Afsa","ADf00","adsfas","adfsad"};
		List list1 = new ArrayList<>(Arrays.asList(strings));
		
		List<String> list2 = new ArrayList<>(list1);
		System.out.println(list2);
		
		System.out.println(list2.size());
		System.out.println(list2.isEmpty());
		System.out.println(list2.contains("asd123"));
		System.out.println(list.indexOf("TestNg"));
		System.out.println(list.set(2, "TestNg"));
		System.out.println(list);
		
		
/*		Object[] listOfArray =list.toArray();
		
		for(Object s : listOfArray)
			System.out.println(s);
		*/
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
	}
}
