class CalculatorExep
{
int result=0;
int arr[]=new int[5];
public static void main(String args[])
{

CalculatorExep c=new CalculatorExep();
c.divide(10,0);
}
void divide(int n1,int n2)
{
try
{
result=n1/n2;
arr[5]=10;
}
catch(ArithmeticException e)
{
System.out.println(e);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
System.out.println(result);
}
}