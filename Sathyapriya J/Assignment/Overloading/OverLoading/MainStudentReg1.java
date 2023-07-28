class MainStudentReg1
{
	public static void main(String a[])
	{
		StudentReg1 Student1 = new StudentReg1();
		Student1.display();
		StudentReg1 Student2 = new StudentReg1(101);
		Student2.display();
		StudentReg1 Student3 = new StudentReg1(101,"Sathya");
		Student3.display();
		StudentReg1 Student4 = new StudentReg1(101,"Sathya",12);
		Student4.display();
		StudentReg1 Student5 = new StudentReg1(101,"Sathya",12,"A");
		Student5.display();
	}
}
		 