import java.util.Scanner;
class Arithmetic
{
int a,b;
void Basic()
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("The sum of a and b is:" +(a+b));
System.out.println("The difference of a and b is:" +(a-b));
System.out.println("The product of a and b is:" +(a*b));
System.out.println("The remainder of a and b is:" +(a%b));
System.out.println("The quotient of a and b is:" +(a/b));
}
}
public class Operations
{
public static void main(String args[])
{
System.out.println("Enter the value of a and b:");
Arithmetic o=new Arithmetic();
o.Basic();
}
} 