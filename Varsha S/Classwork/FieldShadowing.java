class Parent
{
String Name  = "Varsha";
}

class Child extends Parent
{
private String Name = "Prodapt";
}

class FieldShadowing
{
public static void main(String args[])
{
Parent p = new Child();
System.out.println(p.Name);
}
}