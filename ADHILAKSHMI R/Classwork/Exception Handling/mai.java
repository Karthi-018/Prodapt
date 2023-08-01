import java.util.*;
class Demo{
void myfun(int n1,int n2,String str)throws Exception
{
Scanner sc=new Scanner(System.in);
int size = sc.nextInt();

int arr[]=new int[size];
if(str==null)
{
throw new NullPointerException();
}
else{
System.out.println(str.length());
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


class mai{
public static void main(String args[])
{
Demo d=new Demo();
try{
d.myfun(10,5,"adhi");
int result=0;
 result=10/0;
System.out.println("the result is: " +result);
}
catch(Exception e)
{
System.out.println(e);
}
}
}


