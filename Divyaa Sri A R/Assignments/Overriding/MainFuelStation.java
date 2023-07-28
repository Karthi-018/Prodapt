class FuelStation
{
	public void refuel(String fuelname)
	{
		System.out.println("Refueling the vehicle with" +fuelname);
	}
}
class PetrolStation extends FuelStation
{
	public void refuel(String fuelname)
	{
		if(fuelname.equals("petrol"))
		{
			System.out.println("Refueling vehicle with petrol");
		}
		else
		{
			System.out.println("Sorry " +fuelname+ " is not providing at this station");
		}
	}
}
class DieselStation extends FuelStation
{
	public void refuel(String fuelname)
	{
		if(fuelname.equals("Diesel"))
		{
			System.out.println("Refueling vehicle with Diesel");
		}
		else
		{
			System.out.println("Sorry " +fuelname+ " is not providing at this station");
		}
	}
}
class GasStation extends FuelStation
{
	public void refuel(String fuelname)
	{
		if(fuelname.equals("Gas"))
		{
			System.out.println("Refueling vehicle with Gas");
		}
		else
		{
			System.out.println("Sorry " +fuelname+ " is not providing at this station");
		}
	}
}
public class MainFuelStation
{
	public static void main(String a[])
	{
		PetrolStation p=new PetrolStation();
		p.refuel("petrol");
		DieselStation d=new DieselStation();
		d.refuel("Diesel");
		GasStation g=new GasStation();
		g.refuel("Gas");
		g.refuel("petrol");
	}
}