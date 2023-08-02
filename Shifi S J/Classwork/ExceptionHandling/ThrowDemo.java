class ThrowDemo{
void myFun(int n1,int n2,int size,String str)
{
int arr[]=new int[size];
System.out.println(str.length());
System.out.println(n1/n2);

for(int i=0;i<size;i++)
{
arr[i]=i+1;
}
for(int i:arr)
{
System.out.println(i);
}
}
public static void main(String args[])
{

ThrowDemo d=new ThrowDemo();
try{
d.myFun(10,0,5,"Hiiiiiii");
}
catch(Exception e)
{
System.out.println(e);
}
}
}