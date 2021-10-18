package filehandling;

import java.io.File;



public class D {
	public static void main(String[] args) {
		
		File f=new File("cjc");
		String[]s=f.list();
		for (int i= 0; i < s.length; i++) {
			
			System.out.println(s[0]);
		}
	}

}

