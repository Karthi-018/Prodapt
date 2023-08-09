package edu.prodapt.demos;
import java.util.*;
import java.sql.*;
public class Crud_Employee {
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		Crud_Employee obj=new Crud_Employee();
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		try {
			Scanner sc = new Scanner(System.in);

            System.out.println("Enter 1 to create details, 2 to display details, 3 to update details ,4 to search or 5 to delete:");
            int choice = sc.nextInt();
            
            switch (choice) {
            case 1:
                obj.createDetails();
                obj.displayDetails();
                break;
            case 2:
                obj.displayDetails();
                break;
            case 3:
                obj.updateDetails();
                
                break;
            case 4:
            	obj.search();
            	break;
            case 5:
            	obj.deleteDetails();
            	break;	
            default:
                System.out.println("Invalid choice.");
                break;
        }
	    }
		catch(Exception e) {
			System.out.println(e);
		}

    }
	//------------------------create--------------------------------------------------------------------------
	public void createDetails()throws Exception{
		try {
			System.out.println("Enter student ID:");
	        int id = sc.nextInt();
			System.out.println("Enter student name:");
	        String name = sc.next();
	        System.out.println("Enter student marks:");
	        int marks = sc.nextInt();
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			PreparedStatement ps=con.prepareStatement("INSERT INTO student (sid,sname,smarks) VALUES (?, ?, ?)");
			ps.setInt(1,id);
            ps.setString(2,name);
            ps.setInt(3, marks);
            ps.executeUpdate();
            
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	//----------------------display----------------------------------------------------------------------------
	public void displayDetails() throws Exception{
		try {
		
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			PreparedStatement ps=con.prepareStatement("select * from student");
			ResultSet rs=ps.executeQuery();
	        while(rs.next()) {
	        	System.out.println("Student ID:"+rs.getInt(1));
	        	System.out.println("Student name:"+rs.getString(2));
	        	System.out.println("Student marks:"+rs.getInt(3));
	        	System.out.println();
	        }
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	//----------------update-----------------------------------------------------------------------------------
	public void updateDetails() {
		System.out.println("Enter student ID:");
        int id = sc.nextInt();
        System.out.println("Enter the updated name:");
        String name=sc.next();
        System.out.println("Enter the updated marks");
        int marks=sc.nextInt();
        
        try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			PreparedStatement ps=con.prepareStatement("select * from student where sid= ?");
	        ps.setInt(1, id);
	        ResultSet rs=ps.executeQuery();
	        int temp=0;
			if(rs.next()) {
				temp=1;
				ps=con.prepareStatement("update student set sname = ?, smarks = ? where sid = ?");
				ps.setString(1, name);
				ps.setInt(2, marks);
				ps.setInt(3, id);
				ps.executeUpdate();
				Crud_Employee ob=new Crud_Employee();
	            ob.displayDetails();
				System.out.println("Update Successful");
			}
			else {
				System.out.println("Invalid Id");
			}
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	//------------------------search--------------------------------------------------------------------------
	public void search()throws Exception{
		System.out.println("Enter the search id:");
		int id=sc.nextInt();
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			PreparedStatement ps=con.prepareStatement("select * from student where sid= ?");
	        ps.setInt(1, id);
	        ResultSet rs=ps.executeQuery();
	        while(rs.next()) {
	        	System.out.println("Student id:"+rs.getInt(1));
	        	System.out.println("Student name:"+rs.getString(2));
	        	System.out.println("Student marks:"+rs.getInt(3));
	        }
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	//-------------------------delete-------------------------------------------------------------------------
	public void deleteDetails() {
		System.out.println("Enter the search id:");
		int id=sc.nextInt();
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			PreparedStatement ps=con.prepareStatement("select * from student where sid= ?");
			ps.setInt(1, id);
	        ResultSet rs=ps.executeQuery();
	        int temp=0;
			if(rs.next()) {
				temp=1;
			    ps=con.prepareStatement("delete from student where sid= ?");
	            ps.setInt(1, id);
	            ps.executeUpdate();
	            Crud_Employee ob=new Crud_Employee();
	            ob.displayDetails();
				System.out.println("Delete Successful");
			}	
			else {
				System.out.println("Invalid Id");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}	
