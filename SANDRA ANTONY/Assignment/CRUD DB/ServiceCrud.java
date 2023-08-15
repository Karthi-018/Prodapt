package crudJdbc;

import java.sql.*;
import java.util.*;

class ServiceCrud
{
	Scanner s = new Scanner(System.in);
	PreparedStatement ps;
	ResultSet rs;
	crudJDBC cj = new crudJDBC();
	
	public  crudJDBC findId(int eid, Connection con) throws SQLException
	{
		
		crudJDBC crud = null;
		ps = con.prepareStatement("select * from employee where eid = ?");
		ps.setInt(1, eid);
		rs = ps.executeQuery();
		
		while(rs.next()) 
		{
			
			crud = new crudJDBC(rs.getInt(1),rs.getString(2),rs.getString(3));
			
		}
		
		return null;
		
	}
	
	public  void create(Connection con) throws SQLException
	{	
		System.out.println("Enter your Employee Id");
		cj.setEid(s.nextInt());
		crudJDBC crud = findId(cj.getEid(),con);
		
		if(crud == null) 
		{
			System.out.println("Enter your name");
			cj.setEname(s.next());
			System.out.println("Enter your salary");
			cj.setSal(s.next());
			ps = con.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1, cj.getEid());
			ps.setString(2, cj.getEname());
			ps.setString(3, cj.getSal());
			int temp = ps.executeUpdate();
			
			if(temp == 1) 
			{
				
				System.out.println(cj);
				System.out.println("New details created!");
				
			}
			
			else
			{
				
				System.out.println("Failed to create!");
				
			}
		}
		
		else 
		{
			
			System.out.println(crud.getEid()+" exists already");
			
		}
	}
	
	
	
	public void update(Connection con) throws SQLException
	{
		System.out.println("Enter the id for updation");
		cj.setEid(s.nextInt());
		crudJDBC crud = findId(cj.getEid(),con);
		
		if(crud == null) {
			
			System.out.println(cj.getEid()+" not found!");
			
		}
		
		else 
		{
			System.out.println(crud);
			System.out.println("1.update name");
			System.out.println("2.update salary");
			System.out.println("select the option");
			int option = s.nextInt();
			
			switch(option) 
			{
			
			case 1:
				
				System.out.println("Enter the new name");
				cj.setEname(s.next());
				ps = con.prepareStatement("update employee set eName=? where eId=?");
				ps.setString(1,cj.getEname());
				ps.setInt(2, cj.getEid());
				int uName = ps.executeUpdate();
				
				if(uName == 1) 
				{
					
					System.out.println(cj);
					System.out.println("Name updated!!");
					
				}
				
				else 
				{
					
					System.out.println("Updation failed!!");
					
				}
				
				break;
				
				
			case 2:
				
				System.out.println("Enter the new salary");
				cj.setSal(s.next());
				ps = con.prepareStatement("update employee set salary=? where eId=?");
				ps.setString(1, cj.getSal());
				ps.setInt(2, cj.getEid());
				int uSal = ps.executeUpdate();
				
				if(uSal == 1) 
				{
					
					System.out.println(cj);
					System.out.println("Salary updated!!");
					
				}
				
				else 
				{
					
					System.out.println("Updation failed!!");
					
				}
				
				break;
			}	
		}
	}
	
	
	public void delete(Connection con) throws SQLException
	{
		
		System.out.println("Enter the Id to delete");
		cj.setEid(s.nextInt());
		crudJDBC crud = findId(cj.getEid(),con);
		
		if(crud == null) 
		{
			
			System.out.println(cj.getEid()+" Employee id not found!!");
			
		}
		
		else 
		{
			int temp=0;
			ps = con.prepareStatement("delete from employee where eId=?");
			ps.setInt(1, cj.getEid());
			temp = ps.executeUpdate();
			
			if(temp == 1) 
			{
					
				System.out.println("Deleted successfully!!");
					
			}
				
			else 
			{
					
				System.out.println("Deletion Failed!!");
					
			}
				
		}
				
	}
	
	
	public void display(Connection con) throws SQLException 
	{
		
		ps = con.prepareStatement("select * from employee");
		rs = ps.executeQuery();
		
		while(rs.next()) 
		{
			
			cj.setEid(rs.getInt(1));
			cj.setEname(rs.getString(2));
			cj.setSal(rs.getString(3));
			System.out.println(cj);
				
		}
	 }
	
	
}		


