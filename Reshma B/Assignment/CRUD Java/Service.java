import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Service
{
    
	static Details employee[] = new Details[13];
    static Details temp[] = new Details[13];
	
	public static void empList()
	{
		for(int i=0;i<10;i++)
		{
			employee[i]= new Details((300+(i+1)), "EmpName"+(i+1), "Designation"+(i+1), 50000+(i+1)); 
		}
	}

    public static Details findemp(int eid)
    {
        Details emp = null;
        for(int i=0; i<employee.length; i++)
        {
            if(employee[i] != null)
            {
                if(employee[i].geteid() == eid)
                {
                    emp = employee[i];
                }
            }
        }
        return emp;
    }

    public static Details[] createemp(Details ep)
    {
        Details e = findemp(ep.geteid());

        if (e == null)
        {
            employee[employee.length-1]=ep;
        }
        else
        {
            System.out.println("EMPLOYEE DETAILS ALREADY EXIST");
        }
        return employee;

    }

    public static Details updateemp(int eid, String ename, String des, long sal)
    {
        Details t=findemp(eid);
        if(t == null)
        {
            t.setename(ename);
            t.setdes(des);
            t.setsal(sal);
        }
        else
        {
            System.out.println("DETAILS ALREADY EXIST");
        }
        return t;
    }

    public static Details[] deleteemp()
    {
        System.out.println("ENTER EMPLOYEE TO BE DELETED");
        Scanner sc = new Scanner(System.in);
        int did=sc.nextInt();
        Details dl = findemp(did);
        // System.out.println(dl);
        if(dl != null)
        {
           
            for(int i=0;i<employee.length;i++)
            {
                 if(employee[i]!=null)
                 {
                    if(employee[i].geteid() == did)
                        {
                            continue;
                            
                        }
                    temp[i] = employee[i];
                 }
                
            }
            System.out.println("DELETED SUCCESSFULLY");
        }
        else
        {
            System.out.println("ID NOT FOUND");
        }
        return temp;
        
    }

    public static Details[] employee()
    {
        return employee;
    }
}