import java.util.Scanner;
class mainclass
{
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
employee arr[]=new employee[5];
for(int i=0;i<3;i++){

employee e = new employee();

e.seteid(s.nextInt());
e.seteName(s.next());
e.setsalary(s.nextLong());

/*System.out.println(e.geteid());
System.out.println(e.geteName());
System.out.println(e.getsalary());*/
arr[i]=e;
}
employee e2 = new employee();

e2.emp(arr[0]);
System.out.println("_____________________");
e2.emp(arr[0],arr[1]);
System.out.println("_____________________");
e2.emp(arr[0],arr[1],arr[2]);
System.out.println("_____________________");
}
}
