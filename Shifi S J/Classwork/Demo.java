interface calculator

{
default void add(int n1,int n2)
{
System.out.println("The sum is " +(n1+n2));
mul(n1,n2);
div(n1,n2);
}


static void sub(int n1,int n2)
{
System.out.println("The difference is "+(n1-n2));
mul(n1,n2);
div(n1,n2);
}


 static void mul(int n1,int n2)
{
System.out.println("The product is "+(n1*n2));
}

 static void div(int n1,int n2)
{
System.out.println("The div is "+(n1/n2));
}
}

class Demo implements calculator
{
public static void main(String[] args)
{
Demo d = new Demo();
d.add(10,20);
calculator.sub(30,20);
}
}