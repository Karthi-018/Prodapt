class AccountType
{
public void banking(double balance,double debit,double credit)
{
System.out.println("Account Access Type");
}
}
class SavingsAccount extends AccountType
{
public void banking(double balance, double debit,double credit)
{
System.out.println("User's Account is a Savings Account");
}
}
class SalaryAccount extends AccountType
{
public void banking(double debit,double credit,double bonus)
{
System.out.println("User's Account is a Salary Account");
}
}
class FixedDepositAccount extends AccountType
{
public void banking(double balance, double debit, double interest)
{
System.out.println("User's Account is a Fixed Deposit Account");
}
}