class Vacation
{
	
	void vac()
	{
		System.out.println("There are various beautiful places");
	}
		
		
}

class Munnar extends Vacation
{	
	void vac()
	{
		System.out.println("Munnar is one of the beautiful places");
	}
}
class mainClass
{
	public static void main(String[] args)
	{
		Vacation v = new Munnar();
		/*Vacation va = new Vacation();
		Munnar m = new Munnar();
		va.vac();
		m.vac();*/
		v.vac();
	}
}
	