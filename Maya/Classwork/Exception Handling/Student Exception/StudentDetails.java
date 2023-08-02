class StudentDetails
{		
	int sid;
	String sname;
	int marks;

	 StudentDetails(int sid,String sname,int marks)
	{
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	
	void setsid(int sid)
	{
		this.sid=sid;
	} 
	public int getsid()
	{
		return sid;
	}
	void setsname(String sname)
	{
		this.sname=sname;
	} 
	public String getsname()
	{
		return sname;
	}
	void setmarks(int marks)
	{
		this.marks=marks;
	} 
	public int getmarks()
	{
		return marks;
	}

	    public String toString() {
        return "ID: " + sid + ", Name: " + sname + ", Marks: " + marks;
    }
		
}