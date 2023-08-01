class DemoExceptionThrow
{
public static void main(String args[])
{
DemoExceptionThrow d=new DemoExceptionThrow();
try
{
d.myFunc(10,0,5,null);
}
catch(Exception e)
{
System.out.println(e);
}
}
void myFunc(int n1,int n2,int index,String str)throws Exception
{
int arr[]=new int[index];
//str=null;
if(str==null)
{
throw new NullPointerException();
}
else if(n2==0)
{
throw new ArithmeticException();
}
}}