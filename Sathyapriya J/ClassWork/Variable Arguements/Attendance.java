class Attendance
{
	public void MarkAttendance()
	{
		System.out.println("Mass Bunk");
	}
	public void MarkAttendance(String...s)
	{
		System.out.println(s.length + "Student Present");
		for(String name : s)
		{
			System.out.println(name);
		}
	}
	
	public static void main(String args[])
	{
		Attendance a =  new Attendance();
		a.MarkAttendance();
		a.MarkAttendance("SG");
		a.MarkAttendance("GS","A","B","C");
	}
}





	