class addConstructor
{
int a,b;
String s1,s2;
public int add(int a,int b)
{
return a+b;
}
public String add(String s1,String s2)
{
return s1+s2;
}

public static void main(String args[])
{
add con = new add();
System.out.println(con.add(10,20));

}
}