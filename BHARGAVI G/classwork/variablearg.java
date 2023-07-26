class variablearg
{
public void add(int...num)
{
int sum=0;
for(int n:num)
{
sum=sum+n;
}
System.out.println("sum of " +num.length+ " is "+sum);
}
public static void main(String args[])
{
variablearg c=new variablearg();
c.add(10,20);
c.add(12,39,23);
c.add(28,37,67,98);
}
}