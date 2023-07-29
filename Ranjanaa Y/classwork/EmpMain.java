// Multi level Inheritance 

class Employee
{
//Attributes
private int id,salary;
private String name;

// constructor
Employee(int id,String name,int salary)
{
this.id = id;
this.name = name;
this.salary = salary;
}

// getter
public int getid()
{
return id;
}
public int getsalary()
{
return salary;
}
public String getname()
{
return name;
}

//setter
public void setid(int id)
{
this.id = id;
}
public void setsalary(int salary)
{
this.salary = salary;
}
public void setname(String name)
{
this.name = name;
}
public String toString()
{
return "Enployee details \nid : "+id+"\nName : "+name+"\nSalary : "+salary;
}
}

class Manager extends Employee
{
private String dept;

// constructor
Manager(int id,String name, int salary, String dept)
{
super(id,name,salary);
this.dept = dept;
}
//getter
public String getDept()
{
return dept;
}


// setter
public void setDept(String dept)
{
this.dept = dept;
}
public String toString()
{
return "Manager details \nid : "+super.getid()+"\nName : "+super.getname()+"\nSalary : "+super.getsalary()+"\nDepartment : "+dept;
}
}

class Engineer extends Employee
{
// constructor
Engineer(int id,String name,int salary)
{
super(id,name,salary);
}
public String toString()
{
return "Engineer details \nid : "+super.getid()+"\nName : "+super.getname()+"\nSalary : "+super.getsalary();
}

}

class Admin extends Manager
{
// constructor
Admin(int id,String name,int salary,String dept)
{
super(id,name,salary,dept);
}

public String toString()
{
return "Admin details \nid : "+super.getid()+"\nName : "+super.getname()+"\nSalary : "+super.getsalary()+"\nDepartment : "+super.getDept();
}
}

class Director extends Admin
{
private int budget;

//constructor 
public Director(int id,String name,int salary,String dept,int budget)
{
super(id,name,salary,dept);
this.budget = budget;
}

//getter
public int getBudget()
{
return budget;
}

//setter
public void setBudget(int budget)
{
this.budget = budget;
}
public String toString()
{
return "Director details \nid : "+super.getid()+"\nName : "+super.getname()+"\nSalary : "+super.getsalary()+"\nDepartment : "+super.getDept()+"\nBudget : "+budget;
}

}


class EmpMain
{
public static void main(String args[])
{
Employee e = new Employee(12,"Alia",10000);
Manager m = new Manager(13,"Kiara",20000,"CSE");
Admin a = new Admin(14,"Rishi",20100,"ECE");
Director d = new Director(15,"Varun",30000,"IT",78900);
Engineer eng = new Engineer(16,"Shanaya",28000);
System.out.println(e+"\n"+m+"\n"+a+"\n"+d+"\n"+eng+"\n");

}
}