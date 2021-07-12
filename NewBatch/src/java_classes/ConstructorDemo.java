package java_classes;

public class ConstructorDemo {
	
	String name;
	int no;
	static int a = 60;
	
	 static public void main(String[] varsha) {
		
		//ConstructorDemo cd = new ConstructorDemo("JAva",10);
		ConstructorDemo cd1 = new ConstructorDemo();
	//	ConstructorDemo cd2 = new ConstructorDemo("Automation",20);

		//System.out.println(cd.name);
		//System.out.println(cd2.name);
		int a = 50;
		System.out.println(a);
		
	}
	
	
	public ConstructorDemo()
	{
		this("java",50);
		System.out.println("Hi");
		System.out.println(this.a);
}
	
	public ConstructorDemo(String name, int n)
	{
		this.name = name;
		this.no = no;
		System.out.println("Argument con");
	}

}


//this --> super