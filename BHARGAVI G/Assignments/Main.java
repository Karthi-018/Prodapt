class Bank
{
	public void credit(int accountno,double amount)
{	
	System.out.println("Deposited " + amount + "into account " +accountno);
}
	
public void debit(int accountno,double amount)
{
	System.out.println("withdrawn "+ amount + " from account "+accountno);
}

public void debitbyATM(int accountno,double amount,long atmcardnum)
{
	System.out.println("withdrawnbyATM " + amount +" from account "+accountno);
}
}

public class Main{
public static void main(String args[])
{
Bank b=new Bank();
b.credit(674452,89.90);
b.debit(367378,909.85959);
b.debitbyATM(849383,849.905,1223789);
}
}
