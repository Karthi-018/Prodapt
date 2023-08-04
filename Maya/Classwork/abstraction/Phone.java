// Instance Nested class

class Phone
{
	String model="asdfg";
	int phno=3567;
	
	class Battery
	{	
		void PhoneDetail()
		{
			System.out.println(model);
		}
	}

	public static void main(String[] args)
	{
		Phone p=new Phone();
		Phone.Battery b= p.new Battery();
		b.PhoneDetail();
	}
}

