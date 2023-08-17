package college;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
//stjoseph,stjoseph.com,9840174851,jeppiar,10,chennai,09-09-90
public class CollegeMain {
	 static CollegeBO dbo=new CollegeBO();
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" insert Enter the no of colleges  details / else enter 0 ");
		int n=sc.nextInt();
		sc.nextLine();
		College clg=new College();
		
		List <College> clglist=new ArrayList<>();
    for(int i=0;i<n;i++)
	{
	System.out.println("Enter the name,website,mobileno,founder,numberofDept,location, starting date");
	String s=sc.nextLine();
	try
	{
	clglist.add(createObj(s));
	}
	catch(Exception e)
	{
	System.out.println(e.getMessage())	;
	}
	 
	}
   
	
    int choice;
	do {
		System.out.println("1.find the college by name list"+ "\n2.find college by start date\n3.find collge by location\n4.sort college list based on no of department\n5.exit");
	    choice =sc.nextInt();
	    sc.nextLine();
	    switch(choice)
	    {
	    case 1:
	    	List<String> namelist=new ArrayList<>();
	    	String clg_names[]=sc.nextLine().split(",");
	    	for(String clgs:clg_names)
	    	{
	    	namelist.add(clgs);	
	    	}
	    	List<College> collegeList=new CollegeBO().findCollege(namelist);
	    	System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n","name","website","mobile","founder","noOfDept","location","startingDate");
            for(College clg1: collegeList){
                System.out.println(clg1);
            }
	    	break;
	    case 2:
	    	System.out.println("Enter the start date ");
	    	String sd=sc.next();
	    	java.util.Date date1=null;
	    	DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd");
            try {
				 date1 = dateFormat.parse(sd);
			} catch (ParseException e) {
			
				e.printStackTrace();
			}
            List<College> clgList = new CollegeBO().findCollege(date1);
            System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n","name","website","mobile","founder","noOfDept","location","startingDate");
            for(College clgd : clgList){
                System.out.println(clgd);
            }
	    	break;
	    case 3:
	    	System.out.println("Enter college location");
            String slocation = sc.next();
            List<College> clgLocation = new CollegeBO().findCollege(slocation);
            System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n","name","website","mobile","founder","noOfDept","location","startingDate");
            for(College clg3: clgLocation){
                System.out.println(clg3);
            }
	    	break;
	    
	    case 4:
	    	CollegeBO bo=new CollegeBO();
            List<College> sl = null;
			try {
				sl = bo.sortDept();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
            System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n","name","website","mobile","founder","noOfDept","location","startingDate");
            for(College l : sl){
                System.out.println(l);
            }
	    	break;
	    
	    	default:
	    		
	    	System.exit(0);
	    }
	
	}while(choice<5);
	}
	public static College createObj(String s)throws Exception
	{

		String [] str=s.split(",");
		
			DateFormat df=new SimpleDateFormat("DD-MM-YYYY");
			java.util.Date utilDate=  df.parse(str[6]);
			java.sql.Date date = new java.sql.Date(utilDate.getTime());
		
		 College c=new College(str[0],str[1],str[2],str[3],Integer.parseInt(str[4]),str[5],date);
		 System.out.println(c);
		 dbo.add(c);
		return c;
	}
	
}
