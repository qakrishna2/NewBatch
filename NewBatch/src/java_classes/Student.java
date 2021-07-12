package java_classes;

public class Student {
	
		
	String studentName;
	int studentRollNumber;
	static String schoolName = "Automation";
	boolean b;
	char c;
	float f;
	
	public static void main(String[] args) {
		

		
		System.out.println(schoolName);
		int a = 25;
		System.out.println(a);
		
		
		Student st1 = new Student();
		Student st2 = new Student();
		

		st1.studentName="Java1";
		st1.studentRollNumber=10;
		st1.schoolName = "Manual";
		
	/*	st2.studentName="Selenium";
		st2.studentRollNumber=20;*/
		

		
		System.out.println(st1.schoolName);
		System.out.println(st1.studentName);
		System.out.println(st1.studentRollNumber);

		System.out.println("*******************");

		System.out.println(st2.schoolName);
		System.out.println(st2.studentName);
		System.out.println(st2.studentRollNumber);
		System.out.println(st2.b);
		System.out.println(st2.c);
		System.out.println(st2.f);

		
		
	}


}
