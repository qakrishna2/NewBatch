package java_classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOStreams {
	
	public static void main(String[] args) throws IOException {
		
		 
		/*//char i=;//returns ASCII code of 1st character  

		//System.out.println((char)System.in.read());
		Scanner sc =new Scanner(System.in);
		
	String s = 	sc.nextLine();
	
		
		System.out.println(s.toUpperCase());*/
		
		
		File f = new File("Z:\\Java\\Varsha.txt");
		/*
		FileInputStream fis = new FileInputStream("Z:\\Java\\Varsha.txt");
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String s = br.readLine();
		System.out.println(s);
		char[] c = new char[(int) f.length()];
		fr.read(c);
		
		for(char k :c)
		{
			System.out.print(k);
		}*/
		
		/*int data = fis.read();
		
		while(data!=-1)
		{
			System.out.print((char)data);
			data = fis.read();
		}*/
		
		
		FileWriter pw = new FileWriter(f,true);
		pw.write("Hello");
		pw.close();
	
		
	}

}
