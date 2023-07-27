// method overloading 1

class addConstructor
{

public void add(int a,int b)
{
System.out.println(a+b);
}
public void add(int a1,int b1,int c1)
{
System.out.println(a1+b1+c1);
}
public void add(String s1,String s2)
{
System.out.println(s1+s2);
}

public static void main(String args[])
{
addConstructor con = new addConstructor();
con.add(10,20);
con.add(10,20,30);
con.add("10","20");

}
}