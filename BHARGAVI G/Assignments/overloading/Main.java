class Bank
{
	public void card(int accountno,double amount)
{	
	System.out.println("Deposited " + amount + "into account " +accountno);
}
	
public void card(int accountno,int amount)
{
	System.out.println("withdrawn "+ amount + " from account "+accountno);
}

public void card(int accountno,double amount,long atmcardnum)
{
	System.out.println("withdrawnbyATM " + amount +" from account "+accountno);
}
}

public class Main{
public static void main(String args[])
{
Bank b=new Bank();
b.card(674452,89.90);
b.card(367378,2000);
b.card(849383,849.905,1223789);
}
}
