// method overriding 1

class payment
{
public void pay(int amount)
{
System.out.println("Amount to be paid: "+amount);
}
}
class UPI extends payment
{
public void pay(int amount)
{
System.out.println("Amount "+amount+" paid through UPI");
}
}
class NetBanking extends payment
{
public void pay(int amount)
{
System.out.println("Amount "+amount+" paid through Net Banking");
}
}
class paymentMain
{
public static void main(String args[])
{
payment p = new payment();
p.pay(500);

UPI upi = new UPI();
upi.pay(500);

NetBanking nb = new NetBanking();
nb.pay(500);

}
}