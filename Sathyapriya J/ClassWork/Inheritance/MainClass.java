class MainClass         //------------------> main class
{
	public static void main(String a[])
	{
		Employee e = new Employee(1,"SG");       //----------------> object for employee class
		/*e.setEid(101);
		e.setEname("SG");*/

		Manager m = new Manager(2,"GS","SME");  // -----------------> obj for manager class,Parameterized constructor
		/*m.setEid(102);
		m.setEname("GS");
		m.setDept("SME");*/

		HrManager hr = new HrManager(3,"Gokul","Sathya");
		
		System.out.println(e.getEid());
		System.out.println(e.getEname());
		System.out.println(m.getEid());
		System.out.println(m.getEname());
		System.out.println(m.getDept());
		System.out.println(hr.getEid());
		System.out.println(hr.getEname());
		//System.out.println(hr.getDept());
		System.out.println(hr.getRepManager());
	}
}	