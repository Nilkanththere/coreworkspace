package filehandeling;

import java.io.File;
import java.io.IOException;

public class Checkfiles {

public static void main(String[] args)throws IOException  {
	File f=new File("C:\\Users\\india\\workspace\\Immutations\\xyz");
	
	String[]s=f.list();
	for(int i=0;i<=s.length;i++)
	{
		System.out.println(s[1]);
	
	}
}


	
}

