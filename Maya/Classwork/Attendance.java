class Attendance
{
	void markattendance(String... S)
	{
		System.out.println(S.length+" students present");
		for(String str:S)
		{
			System.out.println(str);
		}
	}

	public static void main(String[] args)
	{	
		Attendance a=new Attendance();
		a.markattendance("aaa","bbb");
		
	}
}