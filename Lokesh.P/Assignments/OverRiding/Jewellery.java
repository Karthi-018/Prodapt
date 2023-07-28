public class Jewellery {
    public static void main(String[] args) {
        //static binding and loosely coupling
        Bracelet b =new Bracelet();
        b.Design(200000,"Diamond");
        //Dynamic binding and tightly coupling
        Bracelet r =new Ring();
        r.Design(30000,"Gold");




    }
}
class Bracelet
{
    private int cost;
    private String model;
    public void Design(int cost,String model)
    {
        System.out.println("The price and model are not affordable");
    }

}
class Ring extends Bracelet
{
    public void Design(int cost,String model)
    {
        System.out.println("The Ring cost is reasonable and affordable");
    }
}
