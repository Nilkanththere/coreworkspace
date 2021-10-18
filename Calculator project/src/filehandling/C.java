package filehandling;

import java.io.File;
import java.io.IOException;

public class C {
public static void main(String[] args) throws IOException {
	
	File f=new File("C:\\Users\\india\\workspace\\Calculator project","xyz.java");
	f.createNewFile();

	File f1=new File("C:\\Users\\india\\workspace\\Calculator project","xyz");
	f1.createNewFile();
			
	System.out.println("ok done");
	 System.out.println(f.isFile());
	 System.out.println(f1.isDirectory());
}
}
