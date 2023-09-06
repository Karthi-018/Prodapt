class StudentPojo{
	private String name;
	private int id;
	private int mark;
	
  public StudentPojo(){}
	public StudentPojo(String name,int id,int mark)
  {
  		this.name=name;
  		this.id=id;
  		this.mark=mark;
  }
  public void setName(String name)
  {
  	this.name=name;
  }
  public String getName()
  {
  	return name;
  }
  public void setId(int id)
  {
  	this.id=id;
  }
  public int getId()
  {
  	return id;
  }
  public void setMark(int mark)
  {
  	this.mark=mark;
  }
  public int getMark()
  {
  	return mark;
  }
  public String toString()
  {
  	return "NAME : "+name+"\nID :"+id+"\nMARK :"+mark;
  }
  public void Display(StudentPojo... n)
  {
  	for(StudentPojo i:n)
    {
  			System.out.println(i);
  	}
  }
}