package stud;

class Student_Attendance
{
	private String stu_Name;
	private int stu_rollno;

	Student_Attendance()
	{
		stu_Name="null";
		stu_rollno=0;
	}
	
	public void setName(String name)
	{
		stu_Name=name;
	}
	
	public void setRollno(int rollno)
	{
		stu_rollno=rollno;
	}
	
	public String getName()
	{
		return stu_Name;
	}
	
	public int getRollno()
	{
		return stu_rollno;
	}

	public String toString()
	{
		return stu_Name+" "+stu_rollno;
	}

	public void StudentAttendance(Student_Attendance... Attend)
	{
		for (Student_Attendance x:Attend)
			System.out.println(x);
	}

}
		