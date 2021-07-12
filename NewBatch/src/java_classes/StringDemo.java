package java_classes;

public class StringDemo {
	
	public static void main(String[] args) {
		
		// String pool
		
		String a = "Automation";
		String c = "Automation";
		String b = new String("Automation");
		
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.length());
		System.out.println(a.isEmpty());
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.trim());
		System.out.println(a.charAt(2));
		//String ss = a.split(",")[1];
		//System.out.println(ss);
		System.out.println(a.concat("H"));
		System.out.println(a.contains("Auto"));
		System.out.println(a.substring(0,10));
		
		System.out.println(a==c); //
		
		
//hello world
		
	}

}


