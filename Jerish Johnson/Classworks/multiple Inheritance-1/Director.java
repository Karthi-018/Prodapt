class Director extends Admin{
	private long budget;
	
	Director(){}
	
	Director(int eid,String ename,long salary,String dept,long budget){
		super(eid,ename,salary,dept);
		this.budget=budget;
	}
	
	public void setBud(long bud){
		budget =bud;
	}
	public long getBud(){
		return budget;
	}
}