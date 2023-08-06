interface A
{
    final int a =13;
    void display();    //abstract method
}

interface B 
{
    int b = 12;
    void display();
}

class C implements A,B
{
    public void display()
    {
        System.out.println("Hello"+a+" "+b);
    }
}

class MainClass
{
    public static void main(String a[])
    {
        C c = new C();
        c.display();

    }
}