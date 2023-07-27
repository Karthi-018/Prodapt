public class Mainfun
{
	public static void main(String a[])
	{
		EmployeeInheritance e= new EmployeeInheritance(101,"ABC",10000000);
		System.out.println(e.getEid());
		System.out.println(e.getEName());
		System.out.println(e.getSal());
		
		System.out.println("***********************");
		Manager m= new Manager(102,"abi",15000000,"IT");
		System.out.println(m.getEid());
		System.out.println(m.getEName());
		System.out.println(m.getSal());
		System.out.println(m.getDept());

		System.out.println("***********************");
		Engineer e1= new Engineer(103,"anu",13000000);
		System.out.println(e1.getEid());
		System.out.println(e1.getEName());
		System.out.println(e1.getSal());
	
		System.out.println("***********************");
		Admin a1= new Admin(104,"ashvik",10800000,"Finance");
		System.out.println(a1.getEid());
		System.out.println(a1.getEName());
		System.out.println(a1.getSal());
		System.out.println(a1.getDept());

		System.out.println("***********************");
		Director d= new Director(105,"abhay",17000000,"Marketing",1025540939);
		System.out.println(d.getEid());
		System.out.println(d.getEName());
		System.out.println(d.getSal());
		System.out.println(d.getDept());
		System.out.println(d.getBudget());
	}
}