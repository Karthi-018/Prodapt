class Car{
	String model="xyz";
	private String ename="123xyz";
	class Engine{
		void cardDetails()
		{
			System.out.println("Car Model is:"+model+"Car Engine:"+ename);
		}
}
}
class CarMain{
	public static void main(String[] args){
	Car c=new Car();
	Car.Engine e=c.new Engine();
	e.cardDetails();
	}
}
