
class MainBill
{
	public static void main(String a[])
	{
		Bill b = new Bill();
		b.fun("apple",1,30);
		b.fun("carrot",2,60,"mango",1,50);
		b.fun("rice",2.5,150.5,"dal",1.5,70.5);
		b.fun("apple",1.5,40.5);
	}
}