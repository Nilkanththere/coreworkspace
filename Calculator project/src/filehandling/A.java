package filehandling;

import java.io.File;



public class A {
public static void main(String[] args){
	File f=new File("xyz");
	
	f.mkdir();
	System.out.println("Create successfully new file");
	
}
}
