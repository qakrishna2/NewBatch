package java_classes;

public class B extends A  {
	
	static int c = 60;
	static int count=0;
	public static void main(String[] args) {
		
		
		B b = new B();
		B b1 = new B();
		B b3 = new B();
		B b4 = new B();
		
		}
		
	
	
	static void add(int a)
	{
		
	}
	B()
	{
		this(5);
		System.out.println("Child Constucrtor");
	}
	B(int a)
	{
		System.out.println("TT");
	}

	{
		System.out.println("Instance");
		count++;
	}
}
