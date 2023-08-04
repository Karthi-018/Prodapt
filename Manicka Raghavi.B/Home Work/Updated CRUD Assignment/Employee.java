package crudmvc;
class Employee 
{ 
private int id;
private String name;
private long salary;

Employee(int id,String name,long salary) 
{ 
this.id=id;
this.name=name;
this.salary=salary; 
}

int getId()
{ 
return id;
}

String getName()
{ 
return name;
} 

long getSalary() 
{ 
return salary;
} 

void setId(int id) 
{ 
this.id=id;
}

void setName(String name) 
{ 
this.name=name;
} 

void setSalary(long salary) 
{ 
this.salary=salary;
} 

public String toString()
{ 
return "Emp Id: "+id+" Emp Name: "+name+" Emp Salary: "+salary;
}  
} 