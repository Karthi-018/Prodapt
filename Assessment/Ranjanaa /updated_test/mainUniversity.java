package university;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class mainUniversity 
{

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		CollegeBO bo = new CollegeBO();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loaded succesfully");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
			System.out.println("Connection succesfull");

			List<College> l = new ArrayList<>();
			int choice =0;
			while(choice <3)
			{
				System.out.println("Enter 1 to add list of college: ");
				System.out.println("Enter 2 to search by college name: ");
				System.out.println("Enter 3 to search by location: ");
				System.out.println("Enter 4 to search by date: ");
				choice = sc.nextInt();
				switch(choice)
				{
				case 1 : 
					System.out.println("Enter no.of.colleges to add: ");
					int no = sc.nextInt();
					for(int i=0;i<no;i++)
					{
					System.out.println("Enter college details to add into a table: ");
					String input = sc.next();
					String[] inputsplit = input.split(",");
					String name = inputsplit[0];
					String website = inputsplit[1];
					String mobile = inputsplit[2];
					String founder = inputsplit[3];
					int numberOfDept = Integer.parseInt(inputsplit[4]);
					String location = inputsplit[5];
					DateFormat df=new SimpleDateFormat("DD-MM-YYYY");
					java.util.Date utilDate=  df.parse(inputsplit[6]);
					java.sql.Date startingDate = new java.sql.Date(utilDate.getTime());
				    // adding input to pojo
					College c = new College(name, website,mobile,founder,numberOfDept,location,startingDate) ;
					l.add(c);
					}
					bo.bulk(con,l);
				System.out.println("Added");
				break;
				
				case 2 : 
					System.out.println("Enter college name to search: ");
					String uname = sc.next();
					List<College> l1= bo.findCollege(uname,con);
					for(College i : l1)
					{
						System.out.format("%-20s %-20s %-20s %-15s %-15s %-20s %-15s \n",i.getName(),i.getWebsite(),i.getMobile(),i.getFounder(),i.getNumberOfDept(),i.getLocation(),i.getStartingDate());
					}
					break;
					
				case 3 : 
					System.out.println("Enter college location to search: ");
					String ulocation = sc.next();
					List<College> l2= bo.findLocation(ulocation,con);
					System.out.println(l2);
//					for(College i : l2)
//					{
//						System.out.format("%-20s %-20s %-20s %-15s %-15s %-20s %-15s \n",i.getName(),i.getWebsite(),i.getMobile(),i.getFounder(),i.getNumberOfDept(),i.getLocation(),i.getStartingDate());
//					}
					break;
					
				case 4 :
					System.out.println("Enter date to search: ");
					DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
					java.util.Date udate=(java.util.Date)df.parse(sc.next()); 
					List<College> l3 = bo.findDate(df.format(udate),con);
					for(College i : l3)
					{
						System.out.format("%-20s %-20s %-20s %-15s %-15s %-20s %-15s \n",i.getName(),i.getWebsite(),i.getMobile(),i.getFounder(),i.getNumberOfDept(),i.getLocation(),i.getStartingDate());
					}
					break;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
