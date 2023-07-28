class Bank
{
	public void details(long account_no, double balance)
	{
		System.out.println("Enter Account Number: "+account_no+"\nYour Balance is: "+balance);
	}
}
class CreditCard
{
	public void details(long creditcard_no, double balance)
	{
		System.out.println("Enter Credit card Number: "+creditcard_no+"\nYour loan debt balance is: "+balance);
	}
}
class DebitCard
{
	public void details(long debitcard_no, double balance)
	{
		System.out.println("Enter Debit card Number: "+debitcard_no+"\nYour loan debt balance is: "+balance);
	}
}
class BankDetails
{
	public static void main(String a[])
	{
		Bank b=new Bank();
		b.details(1010004501,20000);
	}
}

		