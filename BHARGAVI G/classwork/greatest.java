import java.util.Scanner;
public class greatest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int num3=sc.nextInt();
int num4=sc.nextInt();
int num5=sc.nextInt();
if(num1>num2 && num1>num3 && num1>num4 && num1>num5)
{
System.out.println("num1 is greater");
}
else if(num2>num3 && num2>num4 && num2>num5 && num2>num1)
{
System.out.println("num2 is greater");
}
else if(num3>num4 && num3>num5 && num3>num1 && num3>num2)
{
System.out.println("num3 is greater");
}
else if(num4>num5 && num4>num1 && num4>num2 && num4>num1)
{ 
System.out.println("num4 is greater");
}
else
{
System.out.println("num5 is greater");
}
}
}

 