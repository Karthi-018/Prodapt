import java.util.*;
class Student
{
int sid;
String sname;
int smarks;
Student(int sid,String sname,int smarks){
this.sid=sid;
this.sname=sname;
this.smarks=smarks;

}
public void setsid(int sid)
{
this.sid=sid;
}
public int getesid()
{
return sid;
}
public void setsname(String sname)
{
this.sname=sname;
}
public String getsname()
{
return sname;
}
public void setsmarks(int smarks)
{
this.smarks=smarks;
}
public long getsmarks()
{
return smarks;
}
}
public class neww{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
Student arr[]=new Student[5];

arr[0]=new Student(100,"adhi",12);
arr[1]=new Student(101,"Nivi",13);
arr[2]=new Student(102,"Preethi",14);
arr[3]=new Student(103,"Anand",15);
arr[4]=new Student(104,"adhii",16);
neww n=new neww();
try{
n.search(arr);
}
catch(Exception e){
System.out.println(e);
}


}
public void search(Student[] arr) throws Exception{
	Scanner sc=new Scanner(System.in);
	int x=0;
	System.out.println("Enter the id to be searched");
	int id=sc.nextInt();
	for(int i=0;i<arr.length;i++){
		if(arr[i].sid==id){
			x=1;
			System.out.println("ID found");
			System.out.println("ID=" +arr[i].sid+"  Name="+arr[i].sname+"  Marks="+arr[i].smarks);
		}
	}
	if(x==0){
		
		throw new StudentNotFoundException(id);
	}
}
}



