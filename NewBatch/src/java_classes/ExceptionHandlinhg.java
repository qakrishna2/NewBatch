package java_classes;

public class ExceptionHandlinhg {

	String s ; //null 4
	static int i;
	static boolean b; //false

	
	public static void main(String[] args) throws InterruptedException {
		
		try {
		throw new NullPointerException("Throw");
		}catch(NullPointerException ne)
		{
			System.out.println(ne.getMessage());
			System.out.println(ne.getCause());
		}
		
	}
	
	public static void m1() throws InterruptedException
	{
		
		/*try
		{
		System.out.println(5/0);
		}catch(Exception e)
		{
			try {
			System.out.println(5/0);
			}catch(Exception ee)
			{
				System.out.println("hello");
			}
		}
	
			Thread.sleep(30000); //Cehcked Expetion , Compiler 2 choices
*/			
	}
}

