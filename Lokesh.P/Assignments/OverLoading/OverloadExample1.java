public class OverloadExample1 {
    public static void main(String[] args)
    {
        Vehicle v =new Vehicle();
        v.setInfo(45000,"Toyota",2018);
        v.display();
        v.setInfo(300000,"Honda");
        v.display();

    }

}
class Vehicle
{
    private int price;
    private String make;
    private int year;
    public void setInfo(int price, String make)
    {
        this.price=price;
        this.make=make;
    }
    public void setInfo(int price,String make, int year)
    {
        this.price=price;
        this.make=make;
        this.year=year;
    }
    public void display()
    {
        System.out.println("Price:"+price);
        System.out.println("Make:"+make);
        System.out.println("Year:"+year);

    }
}