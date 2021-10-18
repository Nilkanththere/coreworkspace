package filehandeling;
import java.io.File;
import java.io.IOException;

public class D {



	public static void main(String[] args)throws IOException   {
		File f=new File("C:\\Users\\india\\workspace\\Immutations\\xyz");
		    f.createNewFile();
		    System.out.println(f.isFile());
		    System.out.println(f.exists());
		    System.out.println(f.isDirectory());
	}
}
