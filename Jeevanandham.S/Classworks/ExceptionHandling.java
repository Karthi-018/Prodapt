class ExceptionHandling
{

	public static void main(String[] args)
	{
		int result = 0;

		try
		{
			result = 10/0;
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		finally
		{
			System.out.println("Code executed successfully");
		}
		System.out.println(result);
		

	
	}
}