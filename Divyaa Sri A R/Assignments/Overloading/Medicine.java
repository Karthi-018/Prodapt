class Medicines
{
	public void addmedicine(String medicineName,int price)
	{
		System.out.println("The price of "+medicineName+" is Rs. "+price);
	}
	public void addmedicine(String medicineName,double price, String expiryDate)
	{
		System.out.println("The price of "+medicineName+ " is Rs. "+price+ " with expiry date "+expiryDate);
	}
	public void addmedicine(int quantity,String medicineName,double price, String expiryDate)
	{
		System.out.println("The price of "+quantity+ "strips" +medicineName+ " is Rs. "+(quantity*price)+ " with expiry date " +expiryDate);
	}
}
class Medicine
{
	public static void main(String a[])
	{
		Medicines m=new Medicines();
		m.addmedicine("oinment",60);
		m.addmedicine("tonic",110.25,"25-08-2024");
		m.addmedicine(3,"tablet",39.50,"15-10-2024");
	}
}
