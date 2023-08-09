class Father
{

void beats()
{
System.out.println("angry ---> beats mother");
}

}

class Mother extends Father
{

void cries()
{
System.out.println("angry ---> never beats chidren");
}
}

class Child extends Mother
{
void plays()
{
System.out.println("happy ---> plays everyday");
}
}

class Wholefamily
{
public static void main(String[] args)
{
Child ch = new Child();

ch.plays();
ch.cries();
ch.beats();

}
}

