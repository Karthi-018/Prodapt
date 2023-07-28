class MethodOverloading
{
    public void show(String name)
    {
        System.out.println("My name is "+name);
    }
    public void show(String name, String address)
{
    System.out.println("My name is "+name+ " and I am from "+ address);
}
    public static void main (String [] args)
    {
        MethodOverloading example = new MethodOverloading();
        example.show("Shifi");
        example.show("Shifi", "Kanyakumari");
    }
}