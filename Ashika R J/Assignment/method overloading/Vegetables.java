class Vegetables 
{
    public void Veg(String name, int cost)
    {
       System.out.println("Name :"+name+" "+"Cost :"+cost);
    }
    public void Veg(int cost, String name)
    {
       System.out.println("Cost :"+cost+" "+"Name :"+name);
    }
 
  public static void main(String a[])
   {
  
        Vegetables v = new Vegetables();
        v.Veg("Tomato", 200);
        v.Veg(100, "Potato");
   }
}