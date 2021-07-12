package java_classes;

public class A extends Implementation {
	
	int a = 50;
	
	A t1()
	{
		System.out.println("Parent Instance Method");
		return new A();
	}
	
	
	A()
	{
		System.out.println("Parent Class Constructor");
	}
	
}
