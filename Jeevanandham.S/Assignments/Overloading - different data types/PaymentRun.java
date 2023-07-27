import java.util.Scanner;
class PaymentRun
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the payment mode");
		System.out.println("1.Net banking");
		System.out.println("2.UPI");
		System.out.println("3.Debit card");
		int mode = sc.nextInt();
		Payment p = new Payment();
		
		switch(mode)
		{
			case 1:
				System.out.println("Enter the customer id");
				long custId = sc.nextLong();
				System.out.println("Enter the transaction password");
				String pass = sc.next();
				p.paymentMethod(custId,pass);
				break;

			case 2:
				System.out.println("Enter the UPI ID");
				String upiId = sc.next();
				System.out.println("Enter the password");
				long pin = sc.nextLong();
				p.paymentMethod(upiId,pin);
				break;

			case 3:
				System.out.println("Enter the card number");
				long cardNum = sc.nextLong();
				System.out.println("Enter the expiry date ");
				String expiryDate = sc.next();
				System.out.println("CVV");
				int cvv = sc.nextInt();
				System.out.println("Enter the pin");
				long Cardpin = sc.nextLong();
				p.paymentMethod(cardNum,expiryDate,cvv,Cardpin);
				break;

			default:
				System.out.println("Invalid selection");
				
		}
	
		p.paymentMethod("jee@icc",333);
	}
}