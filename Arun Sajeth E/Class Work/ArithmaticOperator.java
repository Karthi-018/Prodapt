class ArithmaticOperator
{
	public static void main(String a[])
	{
		int num1 = Integer.parseInt(a[0]);
		int num2 = Integer.parseInt(a[1]);
		String opr = a[2];
		
		switch(opr)
		{
			
			case "+" : System.out.println("The Sum of Two numbers is " +(num1+num2));break;
			case "-" : System.out.println("The Diff of Two numbers is " +(num1-num2));break;
			case "*" : System.out.println("The Product of Two numbers is " +(num1*num2));break;
			case "/" : System.out.println("The Div of Two numbers is " +(num1/num2));break;
			case "%" : System.out.println("The Mod of Two numbers is " +(num1%num2));break;
			default : System.out.println("Invalid inout");
		}
	}
}
