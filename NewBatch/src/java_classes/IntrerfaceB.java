package java_classes;

import java.io.Serializable;

public interface IntrerfaceB {
	
	void timing();
	
	static void t1()
	{
		System.out.println("Interface");
	}

	default void t2()
	{
		
	}
	
	public static void main(String[] args) {
		
		t1();
	}
	
	public static void main(int a)
	{
		
	}

}



