package com.wcs.webapp.DaoImpl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.wcs.webapp.DaoI.DaoI;
import com.wcs.webapp.DaoUtil.DaoUtil;
import com.wcs.webapp.model.Employee;

public class DaoImpl implements DaoI{

	@Override
	public void deleteEmployee(String username) {
         Connection con=DaoUtil.getConnection();
		
		String sql="delete  from employee where username='"+username+"'";
		
		
		try {
			Statement smt=con.createStatement();
			
			smt.execute(sql);
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Employee editEmployee(String username) {
		
         Connection con=DaoUtil.getConnection();
		
         Employee emp=new Employee();
		
		String sql="select * from  employee where username='"+username+"'";
		try {
			
			Statement smt=con.createStatement();
			
		ResultSet rs=smt.executeQuery(sql);
		
		 
		  while(rs.next())
		  {
			  
  
			  emp.setUsername(rs.getString(1));
			  emp.setPassword(rs.getString(2));
			  emp.setName(rs.getString(3));
			  emp.setAddr(rs.getString(4));
			  emp.setMobno(rs.getString(5));
			  emp.setGender(rs.getString(6));
			  emp.setDept(rs.getString(7));
			  emp.setDesig(rs.getString(8));
			  emp.setSalary(rs.getString(9));
			  emp.setEmail(rs.getString(10));
			  
		  }
		  
		  
		  
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

		return emp;
	}

	

	@Override
	public void saveEmployee(Employee emp) {
		
		Connection con=DaoUtil.getConnection();
		 
			String sql="insert into employee values(?,?,?,?,?,?,?,?,?,?)";
			
			
			
			
				PreparedStatement ps;
				try {
					ps = con.prepareStatement(sql);
				
				
				System.out.println("Insert data succesfully ");
				ps.setString(1,emp.getUsername());
		        ps.setString(2,emp.getPassword());
		        ps.setString(3,emp.getName());
		        ps.setString(4,emp.getAddr());
		        ps.setString(5,emp.getMobno());
				ps.setString(6,emp.getGender()); 
				ps.setString(7,emp.getDept());
				ps.setString(8,emp.getDesig());
				ps.setString(9,emp.getSalary());
				ps.setString(10,emp.getEmail());
				  
				
				ps.executeUpdate();
				
			
			
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
	}

	@Override
	public Employee updateEmployee(Employee emp) {

		Connection con=DaoUtil.getConnection();
		
		String sql="update employee set password=?,name=?,address=?,mobileno=?,gender=?,department=?,designation=?,salary=?,email=? where username=? ";
		System.out.println(sql);
		try {
PreparedStatement ps1 = con.prepareStatement(sql);
			
           
			
			System.out.println("Update data succesfully ");
			ps1.setString(10,emp.getUsername());
	        ps1.setString(1,emp.getPassword());
	        ps1.setString(2,emp.getName());
	        ps1.setString(3,emp.getAddr());
	        ps1.setString(4,emp.getMobno());
			ps1.setString(5,emp.getGender()); 
			ps1.setString(6,emp.getDept());
			ps1.setString(7,emp.getDesig());
			ps1.setString(8,emp.getSalary());
			ps1.setString(9,emp.getEmail());
			  
			
			ps1.executeUpdate();
			
			
			
			
		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		


	return emp;	
			
	
}

	@Override
	public List<Employee>loginEmployee(String username, String password) {
		List<Employee>list=new ArrayList<Employee>();
		
		
		if(username.equals("admin")&& password.equals("admin"))
		{
		
			
		     
				
			 Connection con=DaoUtil.getConnection();
				Statement smt;
				try {
					smt = con.createStatement();
					String sql="select * from employee";
					ResultSet rs = smt.executeQuery(sql);
					
					 while(rs.next())
					 {
						 
						 Employee emp=new Employee();
					  emp.setUsername(rs.getString(1));
					  emp.setPassword(rs.getString(2));
					  emp.setName(rs.getString(3));
					  emp.setAddr(rs.getString(4));
					  emp.setMobno(rs.getString(5));
					  emp.setGender(rs.getString(6));
					  emp.setDept(rs.getString(7));
					  emp.setDesig(rs.getString(8));
					  emp.setSalary(rs.getString(9));
					  emp.setEmail(rs.getString(10));
					  list.add(emp);	 
					 }
					 
					 
					  
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	 
				
		}
			
			
				else
				{
    Connection con=DaoUtil.getConnection();
		
		Employee emp=new Employee();
		Statement smt;
		try {
			smt = con.createStatement();
			
			
			String sql="select * from employee where username='"+username+"'&& password='"+password+"'";
			ResultSet rs = smt.executeQuery(sql);
			
			 while(rs.next())
			 {
				 
				  emp.setUsername(rs.getString(1));
				  emp.setPassword(rs.getString(2));
				  emp.setName(rs.getString(3));
				  emp.setAddr(rs.getString(4));
				  emp.setMobno(rs.getString(5));
				  emp.setGender(rs.getString(6));
				  emp.setDept(rs.getString(7));
				  emp.setDesig(rs.getString(8));
				  emp.setSalary(rs.getString(9));
				  emp.setEmail(rs.getString(10));
				 
				  list.add(emp);	  
			 }
			
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		return list;
		
		
	
	}

	@Override
	public List<Employee> getAllEmployee() {
		
     Connection con=DaoUtil.getConnection();
     List<Employee>list=new ArrayList<Employee>();
    
				Statement smt;
				try {
					smt = con.createStatement();
					String sql="select * from employee";
					ResultSet rs = smt.executeQuery(sql);
					
					 while(rs.next())
					 {
						 
						 Employee emp=new Employee();
					  emp.setUsername(rs.getString(1));
					  emp.setPassword(rs.getString(2));
					  emp.setName(rs.getString(3));
					  emp.setAddr(rs.getString(4));
					  emp.setMobno(rs.getString(5));
					  emp.setGender(rs.getString(6));
					  emp.setDept(rs.getString(7));
					  emp.setDesig(rs.getString(8));
					  emp.setSalary(rs.getString(9));
					  emp.setEmail(rs.getString(10));
					  list.add(emp);		  
					 }
					 } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	 
		
		return list;
		
	}
	
		

}
