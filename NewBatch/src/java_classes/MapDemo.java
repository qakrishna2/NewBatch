package java_classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;

public class MapDemo {

	
	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "A");
		map.put(1, "a");
		map.put(2, "B");
		map.put(3, "C");
		map.put(null, "D");
		map.put(null, "E");
		
		System.out.println(map);
		
		System.out.println(map.get(1));
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("F"));
		System.out.println(map.keySet());
		
		
		for(Integer i : map.keySet())
		{
			System.out.println(map.get(i));
		}
	
		System.out.println(map.values());
		
		
		for(Entry<Integer, String> a:map.entrySet())
		{
			System.out.println(a.getValue());
		}
		
		
		for(int i=0;i<10;i++)
		{
			
		}
		

	}
}
