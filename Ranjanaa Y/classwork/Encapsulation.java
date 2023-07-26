class Enc
{

private int age;
private String name;

Enc()
{
age=11;
name="Alia";
}

public int getter()
{
return age;
}

public void setter(int age)
{
this.age= age;
}

}

class Encapsulation
{
public static void main(String args[])
{
Enc e = new Enc();
System.out.println(e.getter());
}
}