class IceCream
{
public void Flavours(String colour, String taste,String shape)
{
System.out.println("Flavour varieties of IceCream");
}
class Vanila extends IceCream
{
public void Flavours(String colour, String taste,String shape)
{
System.out.println("Vanila IceCream");
System.out.println("Colour:"+colour+"Taste"+taste+"Shape"+shape);
}
}
class Butterscotch extends IceCream
{
public void Flavours(String colour, String taste,String shape)
{
System.out.println("Butterscotch IceCream");
System.out.println("Colour:"+colour+"Taste"+taste+"Shape"+shape);
}
}
class Chocolate extends IceCream
{
public void Flavours(String colour, String taste,String shape)
{
System.out.println("Chocolate IceCream");
System.out.println("Colour:"+colour+"Taste"+taste+"Shape"+shape);
}
}
}