package University;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


import java.text.*;

public class Mnclass {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		CollegeBO college=new CollegeBO();
		boolean flag=true;
		List<College> result =null;
		while(flag) {
			System.out.println("1.Create the list of Colleges");
			System.out.println("2.Search list of Colleges based on list of names");
			System.out.println("3.Search list of Colleges based on starting date");
			System.out.println("4.Search list of Colleges based location ");
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter the details as a string");
				String line=sc.next();
				String sep[]=line.split(",");
				int nod=Integer.parseInt(sep[4]);
				DateFormat df=new SimpleDateFormat("mm:ss");
				Date d=df.parse(sep[6]);
				College col=new College(sep[0],sep[1],sep[2],sep[3],nod,sep[5],d);
				college.addCollege(col);
				break;
				
			case 2:
				System.out.print("Enter the number of Colleges to be added on the list to search : ");
				int n=sc.nextInt();
				List<String> namelist =new ArrayList<>();
				System.out.println("Enter  colleges as list");
				for(int i=0;i<n;i++) {
					String col1 = sc.next();
					namelist.add(col1);
				}
				if(result.size()==0) {
					System.out.println("No colleges found");
				}
				else {
					college.sortName(result);
				}
				break;
				
			case 3:
				System.out.println("Enter the starting date to search");
				String dat = sc.next();
				DateFormat df1 = new SimpleDateFormat("dd:mm:yy");
				java.util.Date date = df1.parse(dat); 
				Date resul = findCollege(new java.sql.Date(date.getTime()));
				if(result.size()==0) {
					System.out.println("No dates found");
				}
				else {
					college.sortDate(result);
				}
				break;
				
				break;
			}
		}
	}

	private static Date findCollege(java.sql.Date date) {
		// TODO Auto-generated method stub
		return null;
	}
}


