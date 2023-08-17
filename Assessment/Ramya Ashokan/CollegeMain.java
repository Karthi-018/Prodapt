package college;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CollegeMain {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		//String name,website,location,founder,mobile;
		//Date s_date;
		//int numberOfDept;
		List <College> clglist=new ArrayList<>();
    for(int i=0;i<n;i++)
	{
	System.out.println("Enter the name,website,mobileno,founder,numberofDept,location, starting date");
	String s=sc.nextLine();
	try
	{
	College clg=createObj(s);
	clglist.add(clg);
	}
	catch(Exception e)
	{
	System.out.println(e.getMessage())	;
	}
	
	}
	}

	public static College createObj(String s)throws Exception
	{
		String [] str=s.split(",");
		SimpleDateFormat df=new SimpleDateFormat("DD-MM-YYYY");
	    Date d = df.parse(str[6]);
		
		
		return new College(str[0],str[1],str[2],str[3],Integer.parseInt(str[4]),str[5],d);
	}
}
