import java.util.Scanner;
class mainclass
{
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
Employee arr[]=new Employee[3];
for(int i=0;i<3;i++){
Employee e=new Employee();
e.seteid(s.nextInt());
e.seteName(s.next());
e.setesalary(s.nextLong());
arr[i]=e;
}
Employee e2 = new Employee();

 

e2.stud(arr[0]);
System.out.println("_____________________");
e2.stud(arr[0],arr[1]);
System.out.println("_____________________");
e2.stud(arr[0],arr[1],arr[2]);
System.out.println("_____________________");

}
}

