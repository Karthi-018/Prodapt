import java.util.Scanner;
class Zomato
{
	String food1;
	String food2;
	String food3;

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ZOMATO");
		System.out.println("You can order upto three dishes at a time");
		System.out.println("Enter the number of dishes to order:");
		int num = sc.nextInt();
		Delivery d = new Delivery();

		switch(num)
		{
			case 1:
				System.out.println("Enter the food name");
				d.delivery(sc.next());
				break;

			case 2:
				System.out.println("Enter the food names");
				d.delivery(sc.next(), sc.next());
				break;

			case 3:
				System.out.println("Enter the food name");
				d.delivery(sc.next(), sc.next(), sc.next());
				break;

			default:
				System.out.println("Invalid");
				
		}
	}
		
}