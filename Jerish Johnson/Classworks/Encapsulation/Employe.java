//Encapsulation
class Employe
{
	private int eid;
	private String ename;
	Employe(int eid,String ename){
		this.eid=eid;
		this.ename=ename;
	}
	public void setEid(int id){
			eid=id;
	}
	public int getEid(){
		return eid;
	}		
	public void setEname(String name){
		ename=name;
	}
	public String getEname(){
		return ename;
	}
	
}

//This is done by have same argument and same variable such that this keyword is used to identify the variable.
/*class Employe
{
	int eid;
	String ename;
	Employe(int eid,String ename){
		this.eid=eid;
		this.ename=ename;
	}
	public void setEid(int eid){
			this.eid=eid;
	}
	public int getEid(){
		return eid;
	}		
	public void setEname(String ename){
		this.ename=ename;
	}
	public String getEname(){
		return ename;
	}
	
}*/