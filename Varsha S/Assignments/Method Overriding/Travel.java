class Modes
{
void type()
{
System.out.println("Time taken to reach the destination");
}
}

class Car extends Modes
{
void type()
{
System.out.println("By Car - 20 hours");
}
}

class Train extends Modes
{
void type()
{
System.out.println("By Train - 8 hours");
}
}

class Flight extends Modes
{
void type()
{
System.out.println("By Flight - 2 hours");
}
}

class Travel
{
public static void main(String args[])
{

System.out.println("Starting point : CHENNAI");
System.out.println("Destination : BANGLORE");
Modes m = new Modes();
m.type();

Car c = new Car();
c.type();

Train t = new Train();
t.type();

Flight f = new Flight();
f.type();
}

}