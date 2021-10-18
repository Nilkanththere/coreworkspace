package com.braindatawire.institutemanagementsystem.serviceImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.braindatawire.institutemanagementsystem.config.DaoUtil;
import com.braindatawire.institutemanagementsystem.model.Batch;
import com.braindatawire.institutemanagementsystem.model.Course;
import com.braindatawire.institutemanagementsystem.model.Faculty;
import com.braindatawire.institutemanagementsystem.model.Student;
import com.braindatawire.institutemanagementsystem.service.ServiceI;

public class Operation implements ServiceI {

	Scanner sc=new Scanner(System.in);
	public void addCourse() {
		Course c=new Course();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Course Id");
		int cid=sc.nextInt();
		System.out.println("Enter Course Name");
		String cname=sc.next();
		
		c.setCid(cid);
		c.setCname(cname);
		
		Connection con=DaoUtil.getConnection();
		 
		try {
			Statement	smt = con.createStatement();
			String sql="insert into Course value("+c.getCid()+",'"+c.getCname()+"')";
			System.out.println("Insert value Sucessfully="+sql);
			
			smt.execute(sql);
			smt.close();
			con.close();
			
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	
	}
	

	@Override
	public void viewCourse() {
	
		
		Connection con=DaoUtil.getConnection();
		
	String sql="select * from Course";
	
	 
	try {
		Statement	smt = con.createStatement();
		
		ResultSet rs=smt.executeQuery(sql);
		
	while(rs.next())
	{
		System.out.println("Course Id:-"+rs.getInt(1));
		System.out.println("Course Name:-"+rs.getString(2));
	}
		
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	@Override
	public void addFaculty() {
		
			Faculty f=new Faculty();
		Scanner sc=new Scanner(System.in);
	
		
		System.out.println("Enter Faculty Id");
		int fid=sc.nextInt();
		System.out.println("Enter Faculty Name");
		String fname=sc.next();
		
		f.setFid(fid);
		f.setFname(fname);
		
		System.out.println("Enter which Course id you Assign Faculty ");
		int id=sc.nextInt();
		
         Connection con=DaoUtil.getConnection();
       
              
		try {
			 Statement smt = con.createStatement();
			String sql="select * from Course where Course_ID="+id+"";
			ResultSet rs = smt.executeQuery(sql);
			
   while(rs.next())
			{
	    
		if(id==rs.getInt(1))
	    {
	    
	Statement smt1 = con.createStatement();
String sql1="insert into Faculty value("+f.getFid()+",'"+f.getFname()+"','"+rs.getInt(1)+"','"+rs.getString(2)+"')";
System.out.println("Insert value Sucessfully"+sql1);		
          smt1.execute(sql1);
         break; 
			
	    }
	   
		 
   else{
	   
	   System.out.println("Enter Valid Id");
	   break;
        }
	}		
			
					
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
	}

	@Override
	public void viewfaculty() {
		Connection con=DaoUtil.getConnection();
		
		String sql="select * from Faculty";
		
		 try {
			Statement smt=con.createStatement();
			
			
			ResultSet rs=smt.executeQuery(sql);
			
			while(rs.next())
			{
				System.out.println("Faculty Id:-"+rs.getInt(1));
				System.out.println("Faculty Name:-"+rs.getString(2));
				System.out.println("Course Id:-"+rs.getInt(3));
				System.out.println("Course Name:-"+rs.getString(4));
			}
				
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void addBatch() {
		
		Batch b=new Batch();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Batch Id");
		int bid=sc.nextInt();
		System.out.println("Enter Batch Name");
		String bname=sc.next();
		
		b.setBid(bid);
		b.setBname(bname);
		System.out.println("Enter which Faculty id you Assign Batch ");
		int id=sc.nextInt();
		
		 Connection con=DaoUtil.getConnection();
         
		 try {
				 Statement smt = con.createStatement();
				
				String sql="select * from Faculty where Faculty_ID="+id+"";
				ResultSet rs = smt.executeQuery(sql);
				
	while(rs.next())
	{
		if(id==rs.getInt(1))
		{
		Statement smt2 = con.createStatement();
	String sql1="insert into Batch value("+b.getBid()+",'"+b.getBname()+"','"+rs.getInt(1)+"','"+rs.getString(2)+"','"+rs.getInt(3)+"','"+rs.getString(4)+"')";
	System.out.println("Insert value Sucessfully"+sql1);		
	          smt2.execute(sql1);
				break;	
				}
	
	
	else{
		System.out.println("Enter Valid Id ");
		break;
	}
		
		
	}	
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

	@Override
	public void viewbatch() {
Connection con=DaoUtil.getConnection();
		
		String sql="select * from Batch";
		
		 try {
			Statement smt=con.createStatement();
			
			
			ResultSet rs=smt.executeQuery(sql);
			
			while(rs.next())
			{
				System.out.println("Batch Id:-"+rs.getInt(1));
				System.out.println("Batch Name:-"+rs.getString(2));
				System.out.println("Faculty Id:-"+rs.getInt(3));
				System.out.println("Faculty Name:-"+rs.getString(4));
				System.out.println("Course Id:-"+rs.getInt(5));
				System.out.println("Course Name:-"+rs.getString(6));
			
			}
				
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void addStudent() {
		
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		Connection con=DaoUtil.getConnection();
		System.out.println("Enter Student Id");
		int sid=sc.nextInt();
		System.out.println("Enter Student Name");
		String sname=sc.next();
		
		s.setSid(sid);
		s.setSname(sname);
		
		System.out.println("Enter which Batch id you Assign Student ");
		int id=sc.nextInt();
 
         
		 try {
				 Statement smt = con.createStatement();
				
				String sql="select * from Batch where Batch_ID="+id+" ";
				ResultSet rs = smt.executeQuery(sql);
				
	while(rs.next())
				{
		if(id==rs.getInt(1))
		{
		Statement smt2 = con.createStatement();
	String sql1="insert into Student value("+s.getSid()+",'"+s.getSname()+"','"+rs.getInt(1)+"','"+rs.getString(2)+"','"+rs.getInt(3)+"','"+rs.getString(4)+"','"+rs.getInt(5)+"','"+rs.getString(6)+"')";
	System.out.println("Insert value Sucessfully"+sql1);		
	          smt2.execute(sql1);
			
				break;	
				}
			
		else{
			System.out.println("Enter Valid Id");
			break;
		}
		
				}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
	}

	@Override
	public void viewstudent() {
   Connection con=DaoUtil.getConnection();
		
		String sql="select * from Student";
		
		 try {
			Statement smt=con.createStatement();
			
			
			ResultSet rs=smt.executeQuery(sql);
			
			while(rs.next())
			{
				System.out.println("Student Id:-"+rs.getInt(1));
				System.out.println("Student Name:-"+rs.getString(2));
				System.out.println("Batch Id:-"+rs.getInt(3));
				System.out.println("Batch Name:-"+rs.getString(4));
				System.out.println("Faculty Id:-"+rs.getInt(5));
				System.out.println("Faculty Name:-"+rs.getString(6));
				System.out.println("Course Id:-"+rs.getInt(7));
				System.out.println("Course Name:-"+rs.getString(8));
			
			}
				
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
