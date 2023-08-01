class demo
{
	void myfunc(int n1,int n2,int size,String str) throws Exception 
{
int arr[]=new int[size];
if(str==null)
{
	throw new NullPointerException();
}
else
{
	System.out.println(str.length());
}
if(n2==0)
{
	throw new ArithmeticException();
}
for(int i=0;i<size;i++)
{
	arr[i]=i+1;
}
for(int i:arr)
{
	System.out.println(i);
}
}
}
class Exceptionalhandling
{
public static void main(String args[])
{
	demo d=new demo();
try
{
	d.myfunc(3,2,1,"hello");
}
catch(Exception e)
{ 	
	System.out.println(e);
}
}
}
