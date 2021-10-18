package filehandeling;

import java.io.File;
import java.io.IOException;

public class C {
public static void main(String[] args) throws IOException {
	
	File f=new File("xyz");
	f.mkdir();
	File f2=new File("pqr.txt");
	     f2.createNewFile();
	
	     File f3=new File(f,"ashish.txt");
	     f3.createNewFile();
	     File f4=new File(f,"neel.txt");
	     f4.createNewFile();
	     File f5=new File(f,"shiv.txt");
	     f5.createNewFile();
	    File f1=new File(f,"abc.java");
	     f1.createNewFile();
	     System.out.println("create file in folder ");
}
}
