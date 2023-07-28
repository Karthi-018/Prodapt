class AccountMain
{

public static void main(String args[])
{
AccountType act=new SavingsAccount();
act.banking(10000.0,6000.0,8000.0);
AccountType ac=new SalaryAccount();
ac.banking(6000.0,8000.0,3000.0);
AccountType a=new FixedDepositAccount();
a.banking(10000.0,6000.0,12000.0);
}
}