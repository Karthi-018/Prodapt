class Payment
{
	long custId = 555555;
	String pass = "password";
	long pin = 3333;
	String upiId = "upi@icc";
	long cardNum = 999999;
	String expiryDate = "12/24";
	int cvv = 6789;

	

	public void paymentMethod(long custId, String pass)
	{
		if(this.custId == custId && this.pass == pass)
		{
			System.out.println("Your payment using Net banking is successful");
		}
		else
		{
			System.err.println("Your customer id or password is incorrect");
		}

	}


	
	public void paymentMethod(String upiId, long pin)
	{
		if(this.upiId == upiId && this.pin == pin)
		{
			System.out.println("Your payment using UPI is successful");
		}
		else
		{
			System.err.println("Your upi Id or pin is incorrect");
		}
		
	}


	
	public void paymentMethod(long cardNum, String expiryDate, int cvv, long Cardpin)
	{
		if(this.cardNum==cardNum && this.expiryDate==expiryDate && this.cvv==cvv && pin==Cardpin )
		{
			System.out.println("Your payment using Debit card is successful");
		}
		else
		{
			System.err.println("The entered card details are invalid");
		}

		
	}
		
}


