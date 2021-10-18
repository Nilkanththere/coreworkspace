package com.cjc;

import java.io.File;
import java.io.IOException;



public class Fold {
	public static void main(String[] args)throws IOException{
		
		File f=new File("cjc");
		String[]s=f.list();
		for (int i= 0; i < s.length; i++) {
			
			System.out.println(s[0]);
		}
	}

}

