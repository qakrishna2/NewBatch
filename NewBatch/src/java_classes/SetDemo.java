package java_classes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("FSA","FADAS","FSA");
		Set<String> set = new HashSet();
		
		set.add("A");
		System.out.println(set.add("A"));
		set.add("B");
		set.add("C");
		
		System.out.println(set);
		
		set.addAll(list);
		System.out.println(set);
		
		list.get(0);
		
		Iterator<String> iterator = set.iterator();
		
/*		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			iterator.remove();
		}
		
		System.out.println(set);*/
		
		
			System.out.println(set.contains("FSA"));
		
	}

}
