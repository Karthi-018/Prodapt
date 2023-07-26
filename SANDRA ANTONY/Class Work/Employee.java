

class Employee
{
    int eid;
    String ename;
    String dest;
    long salary;
    setEmployeeDetails(int id,String name, String des, long sal);
    {
        eid=id;
        eName=name;
        dest=des;
        salary=sal;
    }
    void displayEmloyeeDetails()
    {
        System.out.println("Employee ID: "+eid);
        System.out.println("Employee ID: "+eName);
        System.out.println("Employee ID: "+dest);
        System.out.println("Employee ID: "+salary);
           
    }
}