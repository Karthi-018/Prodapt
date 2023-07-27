class Shopping
{

void payment(int amount)
{
System.out.println("Payment by cash success: "+  amount);
}

void payment(long card_no, long cvv, int otp, String card_name)
{
System.out.println("Payment from " + card_name + "'s card success");
}

void payment(long acc_no, String pswrd, int otp)
{
System.out.println("Payment from bank with Account Number " + acc_no + " success");
}

}

class MainShopping
{
public static void main(String args[])

{
Shopping s = new Shopping();
s.payment(1450);
s.payment(63745363, 456, 7864, "Varsha");
s.payment(8764245, "xyz", 675);

}
}

