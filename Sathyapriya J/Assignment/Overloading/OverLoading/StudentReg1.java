class StudentReg1
{
	int Regid;
	String name;
	int cls;
	String section;
	
	StudentReg1()
	{
		this.Regid = 0;
		this.name = "Not Entered";
		this.cls = 0;
		this.section ="Not Specified";
	}
	StudentReg1(int Regid)
	{
		this.Regid = Regid;
		this.name = "Not Entered";
		this.cls = 0;
		this.section ="Not Specified";
	}
	StudentReg1(int Regid,String name)
	{
		this.Regid = Regid;
		this.name = name;
		this.cls = 0;
		this.section ="Not Specified";
	}
	StudentReg1(int Regid,String name,int cls)
	{
		this.Regid = Regid;
		this.name = name;
		this.cls = cls;
		this.section ="Not Specified";
	}
	StudentReg1(int Regid,String name,int cls,String section)
	{
		this.Regid = Regid;
		this.name = name;
		this.cls = cls;
		this.section =section;
	}
	public void display()
	{
		System.out.println("Student Id : "+Regid);
		System.out.println("Student Id : "+Regid+" Student Name : "+name);
		System.out.println("Student Id : "+Regid+" Student Name : "+name+" Class : "+cls);
	        System.out.println("Student Id : "+Regid+" Student Name : "+name+" Class : "+cls+" Section : "+section);
	}
	


}