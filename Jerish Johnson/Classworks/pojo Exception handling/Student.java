class Student{
	int sid;
	String sname;
	int marks;
	
	Student(int sid,String sname,int marks){
		this.sid=sid;
		this.sname=sname;
		this.marks=marks;
	}
	
	
	public int getSid(){
		return sid;
	}
	public String getSname(){
		return sname;
	}
	public int getMarks(){
		return marks;
	}
	public  String toString(){
		return "ID number"+sid+" Name: "+sname+" Marks : "+marks;
	}
}

