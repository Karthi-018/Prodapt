class Art
{
String draw;
public void type_art(String draw)
{
System.out.println("Different types of Arts");
}
}

class pencil extends Art
{
public void type_art(String draw)
{
System.out.println("Pencil drawing is done using " +draw );
}
}

class colour extends Art
{
public void type_art(String draw)
{
System.out.println("colour drawing is done using " +draw );
}
}

class spray extends Art
{
public void type_art(String draw)
{
System.out.println("Spray painting is done using " +draw );
}
}
