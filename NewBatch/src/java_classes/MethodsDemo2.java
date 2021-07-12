package java_classes;

public class MethodsDemo2 {

	static int c = 5;
	static int d = 10;

	public static int add(int a, int b) {
		a = 3;
		b = 6;
		c=15;
		d=20;
		return a + b;

	}

	public static void main(String[] args) {
		
		System.out.println(add(c, d));
		
		
		System.out.println(c);
		System.out.println(d);
		
		int [] i = {1,2,3};
		array(i);

	}

	public static void array(int [] a)
	{
		for(int i : a)
		{
			System.out.println(i);
		}
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	
	
	
	
}
