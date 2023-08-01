public class EmployeeService
{
    
    Employee emp[] = new Employee[15];

    public void firstTenData()           //first 10 set of data
    {
        for(int i=0;i<10;i++)
        {
            emp[i] = new Employee((100+(i+1)),"Employee"+(i+1),"Designation"+(i+1),100000+(i+1)); 
        }
    }

    public Employee isEmployee(int eid)    //checking does employee exist
    {  
        Employee e = null;
        for(int i=0;i<emp.length;i++)
        {
            if(emp[i] != null)
            {
                if(emp[i].getEid()==eid)
                {
                    e = emp[i];
                }
                
            }
        }
        return e;
    }

    public Employee[] createEmp(Employee employee)   //create employee
    {
        Employee e = isEmployee(employee.getEid());
        if(e==null)
        {
            emp[emp.length-1]  = employee;
        }
        else
        {
            System.out.println("Employee already exist!!!");
        }
        return emp;
    }

    public Employee updateEmp(int eid,String ename,String edes,double esal)
    {
        Employee emp = isEmployee(eid);

        if(emp != null)
        {
            emp.setEname(ename);
            emp.setEdes(edes);
            emp.setEsal(esal);
        }
        else
        {
            System.out.println("Employee dosen't exist");
        }
        return emp;
    }
    public Employee[] dispEmp()
    {
        return emp;
    }

    public void delete(int id)
    {
        Employee empDelete = isEmployee(id);
        if(empDelete != null)
        {
            
            int indexDelete = -1;
            for(int i=0;i<emp.length-1;i++)
            {
                if(emp[i] == empDelete)
                {
                    indexDelete = i;
                }
                
            }
            if(indexDelete != -1)
            {
                for(int i=indexDelete;i<emp.length-1;i++)
                {
                    emp[i] = emp[i+1];
                }
                emp[emp.length-1] = null;
            }
        }
        else
        {
            System.out.println("Employee not exist");
        }

    }
    





}