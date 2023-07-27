class calculator
{
public void add(int... num)
{
int sum=0;
for(int n:num)
{
sum +=n;
}
System.out.println("The sum of "+num.length+" is "+sum);
}
public static void main(String a[])
{
calculator c=new calculator();
c.add();
c.add(10,20);
c.add(10,20,30);
c.add(23,45,55,55);
}
}