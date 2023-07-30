class CarSpe
{
	String model="xyz";
	static String enginename="123xye";	
static class Engine
{
	void cardetails(){
	CarSpe c=new CarSpe();
	System.out.println("car model is:" +c.model);
	System.out.println("car engine no is:" +enginename);
}
}
}
public class car{
public static void main(String args[])
{
	
	CarSpe.Engine e=new CarSpe.Engine();
	e.cardetails();
	
}
}