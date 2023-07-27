public class mainc
{
public static void main(String args[])
{
	EmployeeInheritence emp=new EmployeeInheritence(101,"abc",19000000);
	System.out.println("employee details");
	System.out.println(emp.geteid());
	System.out.println(emp.geteName());
	System.out.println(emp.getesalary());
	System.out.println("----------------");

	manager m= new manager(102,"def",20000000,"cce");
	System.out.println("manager details");
	System.out.println(m.geteid());
	System.out.println(m.geteName());
	System.out.println(m.getesalary());
	System.out.println(m.getdept());
	System.out.println("----------------");

	Engineer e=new Engineer(110,"eng",393000000);
	System.out.println("Engineer details");
	System.out.println(e.geteid());
	System.out.println(e.geteName());
	System.out.println(e.getesalary());
	System.out.println("----------------");

	admin a=new admin(10,"ad",393000083,"lce");
	System.out.println("admin details");
	System.out.println(a.geteid());
	System.out.println(a.geteName());
	System.out.println(a.getesalary());
	System.out.println("----------------");

	director d=new director(110,"dc",39393,"kce",89950008);
	System.out.println("director details");
	System.out.println(d.geteid());
	System.out.println(d.geteName());
	System.out.println(d.getesalary());
	System.out.println(d.getbudget());
	System.out.println("----------------");

}
}
	
	
	