class Display
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		switch(num)
		{
			case 1: System.out.println("2");
			case 2: System.out.println("3");
			case 3: System.out.println("4");
			case 4: System.out.println("5");
			case 5: System.out.println("6");
			case 6: System.out.println("7");
			case 7: System.out.println("8");
			case 8: System.out.println("9");
			case 9: System.out.println("10");
				break;
			case 10: System.out.println("End");
				break;
			default: System.out.println("The number is greater than 10");
		}
	}
}