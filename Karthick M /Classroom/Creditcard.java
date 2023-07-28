class Creditcard
{
String ctype;
final int cno;

public Creditcard(String ctype,int cno)
{     
this.ctype=ctype;
this.cno=cno;
}

void cdisplay()
{
System.out.println(ctype);
System.out.println(cno);
}

public static void main(String a[])
{
Creditcard ca=new Creditcard("VISA",123456789);
ca.cdisplay();
}
}