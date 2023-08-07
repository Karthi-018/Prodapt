// inheritance:

//single level

class Parent{ 
void Aclass()

{
System.out.println("a inheriting");
}
}

class Child extends Parent

{

void Bclass()

{
System.out.println("b inheriting");
}

}

class Inheritance
{

public static void main(String[] args)
{

Child i = new Child();

i.Aclass();
i.Bclass();

}
}


