class Ternary
{
public static void main(String args[])
{
int n1=10;
int n2=20;
int result1,result2,result3;

result1=n1%2==0 ? 10:20;
result2=n1>=n2 ? n1:n2;
result3=n1<=n2 ? n1:n2;
System.out.println(result1);
System.out.println(result2);
System.out.println(result3);
}
}