import java.util.*;
class StudentMain
{
public static void main(String args[])
{
StudentMain sm=new StudentMain();
Scanner sc=new Scanner(System.in);
Student std[]=new Student[5];// array declaration
Student student1=new Student(10,"Ram",455);
std[0]=student1;
Student student2=new Student(11,"Ramya",440);
std[1]=student2;
Student student3=new Student(12,"Guna",460);
std[2]=student3;
Student student4=new Student(13,"sachu",455);
std[3]=student4;
Student student5=new Student(14,"senthil",455);
std[4]=student5;
/*for( Student s:std)
{
System.out.println(s);
}*/
System.out.println("Enter the student name to search");
String s_name=sc.next();
try
{
sm.search(s_name,std);
}
catch(Exception e)
{
System.out.println(e);
}
}

public  void search(String s_name,Student [] std)throws StudentNotFoundException
{
boolean b=false;
for(int i=0;i<std.length;i++)
{
if(std[i].getSname().equals(s_name))
{
System.out.println("Student found");
b=true;
break;
}}
if(b==false)
{
throw new StudentNotFoundException(s_name);
}

}}