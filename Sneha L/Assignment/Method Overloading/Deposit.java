public class Deposit{
	public int depositAmount(int amount){
	return amount;
	}
	public int depositAmount(int... amount)
	{
		int totalamount=0;
		for(int i:amount)
		{
			totalamount+=i;
		}
		return totalamount;
	}
	public float depositAmount(float amount1,int... amount2)
	{
		float totalamount=amount1;
		for(int i:amount2)
		{
			totalamount+=i;
		}
		return (float)totalamount;
	}
	public static void main(String args[])
	{
		Deposit account=new Deposit();
		System.out.println("Deposited Amount:"+account.depositAmount(100));
		System.out.println("Deposited Amount:"+account.depositAmount(100,500,75));
		System.out.println("Deposited Amount:"+account.depositAmount(100.50f,50,200));



	}
}