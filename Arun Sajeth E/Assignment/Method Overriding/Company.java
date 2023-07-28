class Company
{

	public void Details(String name)
	{
		System.out.println("Name of the Company:"+name);
	}
}
class Employee extends Company
{
	public void Details(String name)
	{
		super.Details("ABB");
		System.out.println("Name of the Employee:"+name);
	}
}
class MainCompany
{
	public static void main(String a[])
	{
		Employee e=new Employee();
		e.Details("LMN");
	}
}