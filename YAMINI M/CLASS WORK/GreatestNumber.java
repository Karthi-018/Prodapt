import java.util.*;
class GreatestNumber
{
public static void main(String args[])
{
int n1,n2,n3,n4,n5;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 5 Numbers:");
n1=sc.nextInt();
n2=sc.nextInt();
n3=sc.nextInt();
n4=sc.nextInt();
n5=sc.nextInt();
if(n1>n2 && n1>n3 && n1>n4 && n1>n5)
{
System.out.println("n1=" + n1 + "is greatest");
}
else if(n2>n3 && n2>n4 && n2>n5)
{
System.out.println("n2=" + n2 + "is greatest");
}
else if(n3>n4 && n3>n5)
{
System.out.println("n3=" + n3 + "is greatest");
}
else if(n4>n5)
{
System.out.println("n4=" + n4 + "is greatest");
}
else
{
System.out.println("n5=" + n5 + "is greatest");
}
}
}


