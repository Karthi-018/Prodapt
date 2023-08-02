class PojoStudent
{ 
private int id;
private String name;
private int marks; 
PojoStudent(int id,String name,int marks) 
{ 
this.id=id;
this.name=name;
this.marks=marks;
}

public void setId(int id) 
{ 
this.id=id;
}

public void setName(String name) 
{ 
this.name=name;
} 

public void setMarks(int marks) 
{ 
this.marks=marks;
}

public int getId()
{ 
return id;
}

public String getName() 
{ 
return name;
} 

public int marks()
{ 
return marks;
} 

public String toString() 
{ 
 return "Student Details -ID: "+id+" Name: "+name+" Marks: "+marks;
}
}