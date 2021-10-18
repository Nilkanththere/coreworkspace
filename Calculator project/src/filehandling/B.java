package filehandling;

import java.io.File;
import java.io.IOException;

public class B {
	public static void main(String[] args) throws IOException {
		File f=new File("xyz");
		f.mkdir();
		File f1=new File(f,"A.java,Adress.java,Ashish.java,Booking.java,Calculator.java,Financer.java,G.java,H.java,Loan.java,M.java,N.java,Neel.java,obtainemarks.java,Stu.java,Student.java,Task.java,Test.java,Test1.java,Train.java");
		f1.createNewFile();
		System.out.println("ok done ");
		
	}

}
