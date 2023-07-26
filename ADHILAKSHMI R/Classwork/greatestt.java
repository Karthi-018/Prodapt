import java.util.Scanner;
class Greatestt{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int e=sc.nextInt();

if((a>=b)&&(a>=c)&&(a>=d)&&(a>=e))
{
System.out.println("a is greater");
}

else if((b>=c)&&(b>=d)&&(b>=e))
{
System.out.println("b is greater");
}

else if((c>=d)&&(c>=e))
{
System.out.println("c is greater");
}

else if (d>=e)
{
System.out.println("d is greater");
}
else
{
System.out.println("e is greater");
}
}
}




