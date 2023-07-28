class Function
{
void myFunc()
{
System.out.println("Instance Method");
}
static void myFunc(String str)
{
System.out.println("Static Method");
}
public static void main(String a[])
{
Function d= new Function();
d.myFunc();
d.myFunc("AAA");
}
}