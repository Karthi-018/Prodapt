class DemoException
{
public static void main(String args[])
{
DemoException d=new DemoException();
try
{
d.myFunc(10,5,5,"Hi");
}
catch(Exception e)
{
System.out.println(e);
}
}
void myFunc(int n1,int n2,int index,String str)throws Exception
{
int arr[]=new int[index];
str=null;
for(int i=0;i<arr.length;i++)
{
arr[i]=i+1;
}
for(int i:arr)
{
System.out.println(i);
}
/*if(str=null)
{
throw new NullPointerException();
}
else if(n2==0)
{
throw new ArithmeticException();
}*/
}
}