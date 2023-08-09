import java.util.*;
class Student
{
// attributes
int id,marks;
String name;	
// constructor
Student(int id,String name,int marks)
{
	this.id = id;
	this.name = name;
	this.marks = marks;
}
public int getid()
{
	return id;
}
public void setid(int id)
{
	this.id = id;
}
public String getname()
{
	return name;
}
public void setname(String name)
{
	this.id = id;
}
public int getmarks(int marks)
{
	return marks;
}
public void setmarks(int marks)
{
	this.id = id;
}
public String toString()
{
	return id+name+marks;
}
}

class StudentNotFoundException extends Exception
{
	StudentNotFoundException(String name)
	{
		System.out.println("not found");
	}
}
class studException
{
	Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		studException se = new studException();

		// declaring array
		Student studarr[] = new Student[5]; 
		// declaring object to array and pass values to that object
		/*Student sobj1 = new Student(1,"Alia",99);
		// store that object to the respective index
		studarr[0] = sobj1;
		
		Student sobj2 = new Student(2,"Aira",90);
		studarr[1] = sobj2;
		
		Student sobj3 = new Student(3,"lyka",96);
		studarr[2] = sobj3;
		
		Student sobj4 = new Student(4,"Kiara",92);
		studarr[3] = sobj4;
		
		Student sobj5 = new Student(5,"Ria",88);
		studarr[4] = sobj5;*/
		studarr[0] = new Student(1,"abc",99);
		 studarr[1] = new Student(2,"abcs",993);
		 studarr[2] = new Student(3,"afbc",949);
		 studarr[3] = new Student(4,"abcd",993);
		 studarr[4] = new Student(5,"aabc",939);
		
		Scanner sc = new Scanner(System.in);
		//String searchname = sc.next();
		for(Student s : studarr)
		{
			System.out.println(s);
		}
		try
		{
		se.search(studarr);
		}
		catch(Exception e )
		{
			System.out.println(e);
		}
	}
	public void search(Student studarr[]) throws Exception
	{
		boolean flag = false;
		System.out.println("Enter name to search ");
		String sname = sc.next();
		for(int i=0;i<studarr.length;i++)
		{
			if(studarr[i].getname().equals(sname))
			{
				System.out.println("found");
				flag=true;
			}
			
		}
		if(flag==false)
		{
			//System.out.println("not found");
			throw new StudentNotFoundException(sname);
			
		}
	}
}