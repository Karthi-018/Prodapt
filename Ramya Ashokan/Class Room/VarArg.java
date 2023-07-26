class VarArg
{
public void m1(int n2,int...n)
{
System.out.println("n2 is"+n2);
int sum=0;
for(int n1:n)
{
sum=sum+n1;
}
System.out.println("the sum is"+(sum+n2));
}
public static void main(String args[])
{
VarArg v=new VarArg();
v.m1(10,20,30,40,50);

}

}