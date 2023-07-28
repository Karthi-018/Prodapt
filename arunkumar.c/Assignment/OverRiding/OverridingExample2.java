class Car{
	void run(){
		System.out.println("Car Running");
	}
}

class Audi extends Car{
	void run(){
		System.out.println("Audi Running");
	}
}

class BMW extends Car{
	void run(){
		System.out.println("BMW Running");
	}
}

public class OverridingExample2{
	public static void main(String[] args){
		Car audi = new Audi();
		Car bmw = new BMW();
		System.out.println(bmw.run());
		System.out.println(audi.run());
	}
}