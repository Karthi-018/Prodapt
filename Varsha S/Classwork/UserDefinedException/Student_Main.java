class Student_Main
{

Student_Details stuarr[] = new Student_Details[5];

void init()
{ 
stuarr[0]=new Student_Details(101,"abc",1000); 
stuarr[1]=new Student_Details(103,"pqr",2000); 
stuarr[2]=new Student_Details(105,"lmn",3500); 
stuarr[3]=new Student_Details(110,"tuv",5000); 
stuarr[4]=new Student_Details(116,"var",1500); 
} 

void search(int sid) 
{ 
int flag = 0;
for(int i=0;i<5;i++)
{ 
if(stuarr[i].getid() == sid) 
{ 
System.out.println(stuarr[i]);
flag = 1;
break;
} 
}
if(flag == 0)
{
try 
{
throw new StudentNotFoundException(sid);
} 
catch(StudentNotFoundException e)
{
System.out.println(e);
}
}

}

public static void main(String args[])
{
Student_Main student = new Student_Main();
student.init();
student.search(10);
}

}
