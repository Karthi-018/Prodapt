import java.util.*;
class Main
{

StudentDetails stuArr[]=new StudentDetails[10];

public void createDetails()
{
for(int i=0;i<10;i++)
{
StudentDetails ob=new StudentDetails((100+i),"Student"+(i+1),590+i);
stuArr[i]=ob;
}
}

public void search(int id) throws StudentNotFoundException
{
int flag=0;
for(int i=0;i<10;i++)
{
if(id==stuArr[i].getId())
{
flag=1;
break;
}
}

if(flag==1)
{
System.out.println("Student found!!!");
}
else
{
throw new StudentNotFoundException();
}

}



public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Main m=new Main();
m.createDetails();
for(int i=0;i<10;i++)
{
System.out.println(m.stuArr[i]);
}

System.out.println("Enter Student ID to search: ");
int searchId=sc.nextInt();
try
{
m.search(searchId);
}
catch(StudentNotFoundException snfe)
{
System.out.println(snfe);
}
finally
{
System.out.println("BYE Student Not Found user defined exception success!");
}

}


}