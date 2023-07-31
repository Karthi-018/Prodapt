import java.util.*;

class Emp
{
  private String empname;
  private int empid;
  private String empdept;
  private int empsal;

 public Emp(String empname,int empid,String empdept,int empsal)

 {
 this.empname = empname;
 this.empid = empid;
 this.empdept = empdept;
 this.empsal = empsal;
 }

public String getempname()

{
 return empname;
}

public int getempid()

{
 return empid;
}

public String getempdept()

{
 return empdept;
}

public int getempsal()

{
 return empsal;
}

public String toString()

{
return empname+" "+empid+" "+empdept+" "+empsal;
}
}


class Main

{
 public static void main(String a[])

 {

 int op;
 Collection<Emp> c = new ArrayList<Emp>();

 Scanner s = new Scanner(System.in);
 Scanner sc = new Scanner(System.in);

 do{
 System.out.println("Enter choice \n 1.create \n 2.update \n 3.search \n 4.display \n 5.delete");

 op = s.nextInt();
 switch(op)

 {
  case(1):

   System.out.println("creating employee details");
   empname = s.next();
   empid = sc.nextInt();
   empdept = s.next();
   empsal = sc.nextInt();
   c.add(new Emp(empname,empid,empdept,empsal)); 
   break;
  
   case(2):

    boolean f = false;
   System.out.println("Enter no");
   no = sc.nextInt();
   i = c.iterator();
   while(i.hasNext())

   {
    Emp e=i.next();
    if(e.getempid() == empid)

    {
     f=true;
     System.out.println("Enter empname,empdept,empsal");
     empname = s.nextln();
     empdept = s.nextln();
     empsal = sc.nextInt();

     c.set(new Emp(empname,empid,empdept,empsal));
    }
   

   else
   {
    System.out.println("not found");
   }
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
    if(e.getempid() == empid)

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
    if(e.getempid() == empid)
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