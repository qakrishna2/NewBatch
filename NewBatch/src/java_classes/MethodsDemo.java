package java_classes;

public class MethodsDemo {
	
	public static void testMe()
	{
		System.out.println("static method");
		tt();
	}
	
	public void test()
	{
		System.out.println("Instance method");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hi");
		testMe();
		System.out.println("Hi");
		
		MethodsDemo md = new MethodsDemo();
		md.test();
		md.a();
		md.a();
		
		String f = md.a(); //10
		System.out.println(f);
		
	}
	
	public static void tt()
	{
		System.out.println("Hello");
	}
	
	public String a()
	{
		
		return "a";
	}
	
	
	
}
