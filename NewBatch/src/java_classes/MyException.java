package java_classes;

public class MyException extends Exception {
	
public	MyException(String message)
	{System.out.println(message);}
	
public static void test() throws MyException
{
	
}

}

class OtherException extends RuntimeException
{
	
	
public	OtherException(String message)
	{System.out.println(message);}
	
public static void test()
{
	
}

}

class Test
{
	
	
	public static void main(String[] args) {
		
		
		//MyException.test();
	}
	
}