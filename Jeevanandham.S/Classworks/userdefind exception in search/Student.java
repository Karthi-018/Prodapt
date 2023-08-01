class Student
{
	String sName;
	int sId;
	int marks;

	public Student(int sId, String sName, int marks)
	{
		this.sId = sId;
		this.sName = sName;
		this.marks = marks;
	}

	public int getsId() {
        	return sId;
    	}

    	public void setsId(int sId) {
        	this.sId = sId;
   	 }

   	 public String getsName() {
        	return sName;
   	 }

    	public void setsName(String sName) {
       		this.sName = sName;
   	 }

    	public int getMarks() {
        	return marks;
    	}

    	public void setMarks(int marks) {
        	this.marks = marks;
    	}

	public String toString(){
		return sId+" "+sName+" "+marks;
	}
	
}