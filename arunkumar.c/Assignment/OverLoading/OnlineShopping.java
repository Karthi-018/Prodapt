class Cart
{

void orderItems(String item)
{
System.out.println("Payment by cash success for item: "+  item);
}

void orderItems(String item1,String item2)
{
System.out.println("Payment by cash success for items: "+  item1+item2);
}

class OnlineShopping
{
public static void main(String args[])

{
OnlineShopping s = new OnlineShopping();
s.orderItems("Biscuit");
s.orderItems("juice","Ice cream");
}
}
