class Manager extends Employee{
	private String dept;
	
	Manager(){}
	
	Manager(int eid,String ename,long salary,String dept){
		super(eid,ename,salary);
		this.dept=dept;
	}
	
	public void setDept(String depart){
		dept=depart;
	}
	public String getDept(){
		return dept;
	}
}