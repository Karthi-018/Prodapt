
import java.util.*;
class Employee
{
        String name;
        int id;
        int sal;
        Employee o= new Employee();
        Scanner s = new Scanner(System.in);
        Employee[] empArr = new Employee[20];
    
	Employee()
        {}
    
	Employee(int id, String name, int sal)
        {
            this.id=id;
            this.name=name;
            this.sal=sal;
        }
        
        public String toString()
        {
            return "ID: "+id+"  Name: "+name+"    Salary: "+sal;
        }

	
	public void employeedetail(Employee... details)
	{
		for(Employee d:details)
		{
    			System.out.println(d);
		}
	}	
        

	public String getName()
        {
            return name;
        }
	public String getId()
        {
            return id;
        }
        public double getSal()
        {
            return sal;
        }
	void setemp(String name, int id,int sal)
        {
            this.name=name;
            this.id=id;
            this.sal=sal;
            
        }
       
        void displayEmployeeDetails()
	{
		System.out.println("Employee ID : "+id);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Salary : "+sal);
    
        } 

	void intiEmployees()
	{
		Employee emp1 = new Employee(101,"Monica",20000);
  		Employee emp2 = new Employee(102,"Devu",10000);
		Employee emp3 = new Employee(103,"Mary",25000);
		Employee emp4 = new Employee(104,"Xavi",15000);
		Employee emp5 = new Employee(105,"Sruthi",15600);
		Employee emp6 = new Employee(106,"Sid",20090);
		Employee emp7 = new Employee(107,"Ganesh",21050);
		Employee emp8 = new Employee(108,"Gokul",30000);
		Employee emp9 = new Employee(109,"Sathya",50670);
		Employee emp10 = new Employee(110,"Aditya",56000);

		    
	        empArr[0]=emp1;
		empArr[1]=emp2;
                empArr[2]=emp3;
		empArr[3]=emp4;
		empArr[4]=emp5;
		empArr[5]=emp6;
		empArr[6]=emp7;
		empArr[7]=emp8;
		empArr[8]=emp9;
		empArr[9]=emp10;
	}


	void disdetails(Employee emp)                                                  //display
	{
		empArr[empArr.length-1] = emp;
		
		employeedetail(empArr);
	 }

	void update()                                                                   //update
	{

		System.out.println("To update details enter your ID: ");
		int eid=s.nextInt();
		for(int i=0;i<empArr.length;i++)
			{
				if(empArr[i].id == eid)
				{	
					System.out.println("Select 1.To change Name \nSelect 2.To change ID");
					int j= s.nextInt();
					switch(j)
					{case 1:
						uname = s.next();
						empArr[i].name = uname;
						break;

					case 2:
						uid = s.next();
						empArr[i].id = uid;
						break;
					default:
						System.out.println("Invalid option");
					}
					System.out.println(empArr[i]);	
				}
				else
				{	
					System.out.println("Invalid");	
				}
			}
		
	}

	void delete()                                                                    //delete
	{

		System.out.println("To delete your details enter your ID: ");
		int eid=s.nextInt();
		for(int i=0;i<empArr.length;i++)
			{
				if(empArr[i].getId() == eid)
				{
					System.out.println("Enter '0' to delete ID and Salary /nEnter 'null' to ");
					String dname = s.nextLine();
					empArr[i].name = dname;
					int dId = s.nextInt();
					empArr[i].id = id;
					String sal = s.next();
					empArr[i].sal = sal;
					System.out.println(empArr[i]);	
				}
				else
				{	
					System.out.println("Invalid ID");	
				}
			}
		
	}



	void searchdet()                                                                  //search                               
	{

		System.out.println("Enter your ID: ");
		int eid=s.nextInt();
		for(int i=0;i<empArr.length;i++)
			{
				if(empArr[i].id == eid)
				{
					System.out.println(empArr[i]);	
				}
				else
				{	
					System.out.println("Invalid ID");	
				}
			}                 			
	}
}    
 