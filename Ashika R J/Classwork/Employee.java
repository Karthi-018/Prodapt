import java.util.Scanner;
class Employee
{
	int id;
	String name;
	double sal;    
	public int getId() {  
    		return id;  
	}  
	public void setId(int id) {  
    		this.id = id;  
	}  
        public String getName() {  	 
	       return name;
 	}  
	public void setName(String name) {  
    		this.name = name;  
	}  
	public double getSal() {  
    		return sal;  
	}  
	public void setSal(double sal) {  
    		this.sal = sal;  
	}    		
	
     	public String toString()
	{
		return id+" \t"+name+" \t"+sal;
	}

	public  void employ(Employee... dtails)
	{
	     for(Employee e:dtails)
		{
    			System.out.println(e);
		}
	}	
	
	public static void main(String a[])
	{
		
		Scanner s = new Scanner(System.in);
 		Employee eD[] = new Employee[2];
		for(int i=0;i<2;i++)
		{	
			System.out.println("Enter Employee Id:");
			int sid = s.nextInt();
			System.out.println("Enter Employee Name:");
			String sname = s.next();
			System.out.println("Enter Employee Sal:");
			double sal = s.nextDouble();

			Employee Emp = new Employee();
                        Emp.setId(sid);
			Emp.setName(sname);
			Emp.setSal(sal);

			eD[i] = Emp;
		}
		
		System.out.println(eD);
		
		Employee Emparr = new Employee();
		System.out.println("---------------------------");
		Emparr.employ(eD[0]);
		System.out.println("---------------------------");
		Emparr.employ(eD);
		
	}
}