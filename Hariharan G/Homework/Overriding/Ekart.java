package assignment;
import java.util.*;
class Collections
{
//String a="cosmetics";
String b="casuals";
String c="traditionals";
String d="footwear";
public void wardrobe()
{
System.out.println(b+" "+c+" "+d);
}
}

class W_Collections extends Collections
{
String a="cosmetics";
public void wardrobe()
{
System.out.println(a+" "+b+" "+c+" "+d);
}
}


class M_Collections extends W_Collections
{
String e="Accessories";
public void wardrobe()
{
System.out.println(a+" "+b+" "+c+" "+d+" "+e);
}

}

class Ekart
{
public static void main(String args[])
{
Collections c;
c=new Collections();
c.wardrobe();
c=new  W_Collections();
c.wardrobe();
c=new M_Collections();
c.wardrobe();
}
}

