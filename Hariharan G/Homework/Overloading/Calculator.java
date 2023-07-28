package assignment;
import java.util.*;   //over loading
class Calculator
{

public void add(int n1,int n2)
{
System.out.println(n1+n2);
}

public void add(int n1,int n2,int n3)
{
System.out.println(n1+n2+n3);
}

public void add(double n1,double n2)
{
System.out.println(n1+n2);
}

public void add(long n1,long n2)
{
System.out.println(n1+n2);
}

public static void main(String args[])
{
Calculator c=new Calculator();
c.add(1,2);
c.add(1,2,3);
c.add(1.9,2.1);
c.add(100000,20000);
}
}