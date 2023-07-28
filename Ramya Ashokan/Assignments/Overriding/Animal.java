class Animal
{
String food;
public void eat(String food)
{
System.out.println("Animals eat different types of food");
}
}

class Cat extends Animal
{
@Override
public void eat(String food)
{
System.out.println("Cat drinks "+food);
}
}

class Cow extends Animal
{
@Override
public void eat(String food)
{
System.out.println("Cow eats "+food);
}
}
class Lion extends Animal
{
@Override
public void eat(String food)
{
System.out.println("Lion eats "+food);
}
}

