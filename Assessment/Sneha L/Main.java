package University;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.*;
import java.util.*;






public class Main {

	public static void main(String[] args) throws Exception {
		
			Scanner sc=new Scanner(System.in);
			List<College> college=new ArrayList<>();
			Scanner sc1=new Scanner(System.in);
			CollegeBO clgbo=new CollegeBO();
			Boolean b=true;
			while(true)
			{
				List<College> clg1=new ArrayList<>();
				System.out.println("Options\n 1.College list based on name\n 2.College list based on startingDate\n 3.College list based on numberOfDept");
				int ch=sc1.nextInt();
				switch(ch)
				{
				
				case 1:
					List<String> clgname=new ArrayList<>();
					String input1=sc.next();
					
					clgname.add(input1);
					List<College> clg2=clgbo.findCollege(clgname);
					System.out.println("College list sorted based on name");
					Collections.sort(clg2,(o1,o2)->((o1.getName()>o2.getName()?1:-1)));
					for(College i:clg2) {
						System.out.println(i);
					}
						break;
					case 2:
						
						String date=sc1.next();
						Date d= new SimpleDateFormat("dd-mm-yyyy").parse(date);
						List<College> clg3=clgbo.findCollege(d);
						System.out.println("College list sorted based on name");
						Collections.sort(clg3,(o1,o2)->((o1.getDate()>o2.getDate()?1:-1)));
						for(College i:clg3) {
							System.out.println(i);
					}
					break;
					case 3:
						
						String loc=sc1.next();
						List<College> clg4=clgbo.findCollege(loc);
						System.out.println("College list sorted based on name");
						Collections.sort(clg4,(o1,o2)->((o1.getLocation()>o2.getLocation()?1:-1)));
						for(College i:clg4) {
							System.out.println(i);
					}
					break;
					case 4:
						System.out.println("CREATE THE DATA\n Enter the details");
						List<String> clgname1=new ArrayList<>(); 
						String input11=sc.next(); 
						String arr1[]=input11.split(","); 
						Date d1= new SimpleDateFormat("dd-mm-yyyy").parse(arr1[6]); 
						College clg5=new College(arr1[0],arr1[1],arr1[2],arr1[3],Integer.parseInt(arr1[4]),arr1[5],d1);
						college.add(clg5); 
						clgbo.create(college);
						break;

				
			}
			}
			
	}
	

	

}
