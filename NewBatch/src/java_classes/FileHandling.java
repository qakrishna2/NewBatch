package java_classes;

import java.io.File;
import java.io.IOException;

public class FileHandling {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("Z:\\Java"); 
		
		//file.mkdir();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
	
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		
		//System.out.println(file.renameTo(new File("Z:\\Java\\Test")));
		/*for(String s: file.list())
		{
			System.out.println(new File("Z:\\\\Java\\"+s).getAbsolutePath());
		}*/
		
		for(File f : file.listFiles())
		{
			System.out.println(f.getAbsolutePath());
		}
	}

}
