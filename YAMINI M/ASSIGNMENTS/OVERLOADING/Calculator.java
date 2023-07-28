class Calculator 
{
public void add(int n1,int n2)
{
System.out.println("The Sum of Two integers is:"+(n1+n2));
}

public void add(double n1,double n2)
{
System.out.println("The Sum of Two double numbers is:"+(n1+n2));
}
public void add(String n1,String n2)
{
System.out.println("The Sum of Two String is:"+(n1+n2));
}

public static void main(String args[])
{
Calculator opr=new Calculator();
opr.add(5,4);
opr.add(123.4,23.6);
opr.add("Hi","Hello");
}
}
