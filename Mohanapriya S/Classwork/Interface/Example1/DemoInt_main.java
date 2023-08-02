class main implements Demoint,Demoint2
{
public void display()
{
Demoint2.display();
System.out.println("World");
}
public static void main(String a[])
{
main obj=new main();
obj.display();
}
}