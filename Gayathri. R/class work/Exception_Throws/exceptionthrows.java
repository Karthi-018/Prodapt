class exceptionthrows
{
void myfun(int n1,int n2,String str) throws Exception
{
System.out.println(str.length());
System.out.println("div"+(n1/n2));

int arr[]=new int[3];
for(int i=0;i<5;i++)
{
arr[i]=i+1;
}
for(int i:arr)
{
System.out.println(i);
}
}
public static void main(String a[])
{
exceptionthrows demo=new exceptionthrows();
try
{
demo.myfun(5,2,"123");
}
catch(Exception e)
{
System.out.println(e);
}
}

}

