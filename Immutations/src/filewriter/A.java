package filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class A {

	public static void main(String[] args) throws IOException {
		
		FileWriter f=new FileWriter("abc.txt");
		
		          f.write("abc");
		          f.write('a');
		          f.write("\n");
		          f.write("pqr");
		          f.flush();
		          f.close();
	}
}
