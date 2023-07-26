import java.util.*;
class Greatest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int e=sc.nextInt();
if((a>b) && (a>c) && (a>d) && (a>e))
{
System.out.println(a);
}
else if((b>a) && (b>c) && (b>d) && (b>e))
{
System.out.println(b);
}
else if((c>a) && (c>b) && (c>d) && (c>e))
{
System.out.println(c);
}
else if((d>a) && (d>b) && (d>c) && (d>e))
{
System.out.println(d);
}
else
{
System.out.println(e);
}
}
}


