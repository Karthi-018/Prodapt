// method overridding 3

class Rupee
{
public void amount(double a)
{
System.out.println("Indian Rupee : "+a);
}
}
class America extends Rupee
{
public void amount(double b)
{
double dolar = 0.012;
System.out.println("The American dolar is : "+(dolar*b));
}
}
class Japan extends Rupee
{
public void amount(double c)
{
double yen = 1.72;
System.out.println("The Japaneese yen is : "+(yen*c));
}
}

class RupeeMain
{
public static void main(String args[])
{
Rupee r = new Rupee();
r.amount(100.0);

America am = new America();
am.amount(100.0);

Japan jp = new Japan();
jp.amount(100.0);
}
}