import java.util.Scanner;
class details
{
public static void main(String args[])
{
	student studarr[]=new student[5];            /* object creation and passing  values to list*/
	studarr[0]=new student(1,"kavi",100);
	studarr[1]=new student(2,"tamil",10);
	studarr[2]=new student(3,"priya",200);
	studarr[3]=new student(4,"guna",20);
	studarr[4]=new student(5,"vimala",300);

details d=new details();
try{
d.record(studarr);
}
catch(Exception e)
{
	System.out.println(e);
}
}
public void record(student[] studarr) throws Exception
{
	int x=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name to be searched:");
	String name=sc.next();
for(int i=0;i<studarr.length;i++)
{
	if((studarr[i].name).equals(name))               /* for string use equals() to compare*/
	{
	x=1;
	System.out.println("Student details found");
	}
}
if(x==0) 
{
	throw new StudentdetailsNotFoundException(name);
	
}
}
}
