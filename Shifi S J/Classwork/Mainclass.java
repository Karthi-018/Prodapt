import java.util.Scanner;
class Mainclass
{
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
Employee1 arr[]=new Employee1[3];
for(int i=0;i<3;i++){
Employee1 e=new Employee1();
e.seteid(s.nextInt());
e.seteName(s.next());
e.setesalary(s.nextLong());
arr[i]=e;
}
Employee1 e2 = new Employee1();
e2.employ(arr[0]);
System.out.println("----------------------");
e2.employ(arr[0],arr[1]);
System.out.println("----------------------");
e2.employ(arr[0],arr[1],arr[2]);
System.out.println("----------------------");
}
}
