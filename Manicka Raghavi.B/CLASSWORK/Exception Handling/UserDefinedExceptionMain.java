package userdefinedexception; 
import java.util.*;

class UserDefinedExceptionMain 
{

PojoStudentDetails studentarr[]=new PojoStudentDetails[10]; 

void initalize()
{ 
 for(int i=0;i<10;i++) 
 {
  studentarr[i]=new PojoStudentDetails(i+1,"Student"+(i+1),89+1+i); 
  System.out.println(studentarr[i]);
 }
}


void searchName(String name) 
{  
int flag=0;
for(int i=0;i<10;i++) 
{ 
 if(studentarr[i].getName().equals(name))  
 { 
  System.out.println(studentarr[i]); 
  flag=1;
  break;
 }
}
if(flag==0) 
{ 
 try
 {
  throw new StudentNotFoundException(name);
 }
 catch(StudentNotFoundException e) 
 { 
  System.out.println(e);
 }
}
} 


void searchId(int id)
{  
int flag=0;
for(int i=0;i<10;i++) 
{ 
  if(studentarr[i].getId()==id)  
  {  
   System.out.println(studentarr[i]); 
   flag=1;
   break;
  }
}
if(flag==0) 
{ 
  try 
  {
   throw new StudentNotFoundException(id);
  }
  catch(StudentNotFoundException e) 
  { 
    System.out.println(e);
  }
}
}

 
public static void main(String[]args) 
{ 
System.out.println("User Defined Exception Program"); 

Scanner sc=new Scanner(System.in);  
UserDefinedExceptionMain object=new UserDefinedExceptionMain();
object.initalize();

System.out.println("Enter\n 1-To Search Name \n 2-To Search Id");
int n=sc.nextInt(); 

switch(n) 
{ 
case 1:System.out.println("Enter the student name to search Student Details:");
       object.searchName(sc.next());
       break;

case 2:System.out.print("Enter the student ID to search Student Details\n");
       object.searchId(sc.nextInt());
       break;     

default:System.out.print("Wrong Input\n");
        System.exit(0);
      
}
}
}