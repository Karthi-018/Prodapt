import java.util.*;
class Emp
{
  private String name;
  private int id;
  private String dept;
  private int sal;

 public Emp(String name,int id,String dept,int sal)
 {
 this.name=name;
 this.id=id;
 this.dept=dept;
 this.sal=sal;
 }

public String getname()
{
 return name;
}

public int getid()
{
 return id;
}

public String getdept()
{
 return dept;
}

public int getsal()
{
 return sal;
}

public String toString()
{
return name+" "+id+" "+dept+" "+sal;
}
}


class Main
{
 public static void main(String a[])
 {
 int op;
 Collection<Emp> c=new ArrayList<Emp>();
 Scanner s=new Scanner(System.in);
 Scanner sc=new Scanner(System.in);
 do{
 System.out.println("Enter choice \n 1.create \n 2.update \n 3.search \n 4.display \n 5.delete");
 op=s.nextInt();
 switch(op)
 {
  case(1):
   System.out.println("creating employee details");
   name=s.next();
   id=sc.nextInt();
   dept=s.next();
   sal=sc.nextInt();
   c.add(new Emp(name,id,dept,sal)); 
   break;
  
   case(2):
    boolean f=false;
   System.out.println("Enter no");
   no=sc.nextInt();
   i=c.iterator();
   while(i.hasNext())
   {
    Emp e=i.next();
    if(e.getid()==id)
    {
     f=true;
     System.out.println("Enter name,dept,sal");
     name=s.nextln();
     dept=s.nextln();
     sal=sc.nextInt();
     c.set(new Emp(name,id,dept,sal));
    }
   }
   else
   {
    System.out.println("not found");
   }
   break;
  
   case(3):
   boolean f=false;
   System.out.println("Enter no");
   no=sc.nextInt();
   i=c.iterator();
   while(i.hasNext())
   {
    Emp e=i.next();
    if(e.getid()==id)
    {
     f=true;
     System.out.println(e);
    }
   }
   else
   {
    System.out.println("not found");
   }
   break;
  
   case(4):
   Iterator<Emp> i=c.iterator();
   while(i.hasNext())
   {
    Emp e=i.next();
    System.out.println(e);
   }
   break;
  
   case(5):
   f=false;
   System.out.println("Enter no");
   no=sc.nextInt();
   i=c.iterator();
   while(i.hasNext())
   {
    Emp e=i.next();
    if(e.getid()==id)
    {
     f=true;
     i.remove();
    }
   }
   else
   {
    System.out.println("not found");
   }
   break;
  }
 }while(op!=0);
 }
}
