package com.braindatawire.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

import com.braindatawire.DaoUtil.DaoUtil;
import com.braindatawire.serviceI.ServiceI;

public class ServiceImpl implements ServiceI {

	@Override
	public void insertData() {
    Connection con=DaoUtil.getConnection();
		
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter No.of Row You want to Insert");
    int no=sc.nextInt();
    for(int i=0;i<no;i++)
    {
       System.out.println("Enter Employee Id");
       int id=sc.nextInt();
       System.out.println("Enter Employee Name");
       String name=sc.next();
       System.out.println("Enter Employee Address");
       String addr=sc.next();
   
		String sql="insert into employee values(?,?,?)";
		System.out.println(sql);
		
     
		try {
			PreparedStatement	ps = con.prepareStatement(sql);
			System.out.println("Insert data succesfully ");
			ps.setInt(1,id);
			ps.setString(2,name);
			ps.setString(3,addr);
			ps.execute();
			ps.close();
			//con.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
		
		
	}

	@Override
	public void updateData() {
		Connection con=DaoUtil.getConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No.of Employee Id You want to update");
	    int no=sc.nextInt();
	    for(int i=0;i<no;i++)
	    {
		System.out.println("Enter Employee Id You want to update");
	    int id=sc.nextInt();
	   
	    System.out.println("Enter Name you want to Update ");
		String name=sc.next();
		System.out.println("Enter Adress you want to Update ");
		String address=sc.next();
		
		String sql="update Employee set name=?,address=? where id=?";
		System.out.println(sql);
	    
		try {
			PreparedStatement	ps = con.prepareStatement(sql);
			ps.setString(1,name);
            ps.setString(2,address);
            ps.setInt(3,id);
            
            ps.execute();
            ps.close();
            con.close();
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	    }			
	}

	@Override
	public void selectData() {
		
		Connection con=DaoUtil.getConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id You want to Fetch Data");
	    int id=sc.nextInt();
	    
	    String sql="select * from employee ";
	    
	    try {
			PreparedStatement ps=con.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{ 
				if(id==rs.getInt(1))
				{
				System.out.println("Emplyee Id="+rs.getInt(1));
				System.out.println("Employee Name="+rs.getString(2));
				System.out.println("Employee Address="+rs.getString(3));
				System.out.println();
				
			}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	
	}

	@Override
	public void deleteData() {
		Connection con=DaoUtil.getConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id You want to Delete");
	    int id=sc.nextInt();
	    
	    String sql="delete from employee where id=?";
	    System.out.println(sql);
	     
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			   ps.setInt(1,id);
			    ps.execute();
			    ps.close();
			    con.close();
			    
			    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	   
	
	
	}
}
