class Employee{
	private int eid;
	private String ename;
	private long salary;
	
	Employee(){}
	
	Employee(int eid,String ename,long salary){
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
	}
	
	public void setId(int id){
		eid =id;
	}
	public int getId(){
		return eid;
	}
	public void setName(String name){
		ename=name;
	}
	public String getName(){
		return ename;
	}
	public void setSal(long sal){
		salary=sal;
	}
	public long getSal(){
		return salary;
	}
}