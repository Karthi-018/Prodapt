package University;

import java.util.Date;
import java.util.Scanner;
import java.text.*;

public class Mnclass {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		CollegeBO college=new CollegeBO();
		boolean flag=true;
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
			}
		}
	}

}
