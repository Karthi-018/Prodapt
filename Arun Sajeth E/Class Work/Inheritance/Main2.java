class Main2
{
	public static void main(String a[])
	{
		Director2 dir = new Director2("ABC",101,1000,"Product",5000);
		System.out.println(dir.getName());
		System.out.println(dir.getEid());
		System.out.println(dir.getsal());
		System.out.println(dir.getDept());
		System.out.println(dir.getBudget());
		
		Engineer2 eng=new Engineer2("XYZ",102,1500);
		System.out.println(eng.getName());
		System.out.println(eng.getEid());
		System.out.println(eng.getsal());

	}
}

		