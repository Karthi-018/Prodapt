interface A1
{
    void myFun();
    static void newFun()
    {

    }
}

interface A2
{
    void myFun();
}

interface c1
{
    void myFun();
}

class Demo
{
    public static void main(String a[])
    {
        B b = () -> {System.out.println("Hi");};
        C c = (10) -> {System.out.println("Hello");};
    }
}
