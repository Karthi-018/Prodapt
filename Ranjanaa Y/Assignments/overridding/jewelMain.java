// method overriding 2

class jewel
{
public void cost(long gram)
{
System.out.println("Gram to be purchased : "+gram);
}
}
class gold extends jewel
{
public void cost(long gram)
{
long g = 5000;
System.out.println("Cost of Gold for " +gram+ " gram :"+(gram*g));
}
}
class silver extends jewel
{
public void cost(long gram)
{
long s = 80;
System.out.println("Cost of silver for " +gram+ " gram :"+(gram*s));
}
}

class jewelMain
{
public static void main(String args[])
{
jewel j = new jewel();
j.cost(20);

gold g = new gold();
g.cost(20);

silver s = new silver();
s.cost(20);
}
}