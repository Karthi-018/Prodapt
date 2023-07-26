package pojo;
import java.util.*;
class Mainclass{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		Org_Empdetails[] obj=new Org_Empdetails[3]; 
                Org_Empdetails object=new Org_Empdetails();
		 for(int i=0;i<3;i++)
                   { 
                        Org_Empdetails o=new Org_Empdetails();
			System.out.println("Enter id:");
			o.seteid(s.nextInt());
			System.out.println("Enter name:");
			o.setName(s.next());
			System.out.println("Enter designation:");
			o.setdesg(s.next());
			System.out.println("Enter salary:");
			o.setsal(s.nextLong());
			obj[i]=o;
			}
		object.Org_Emp(obj);
	}
}		
			
			