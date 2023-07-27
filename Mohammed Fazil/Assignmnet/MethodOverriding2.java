class Vehicle{  
    
  void run(){
      System.out.println("Vehicle is running");
    }  
}  
 
class Bike extends Vehicle{  
    
  void run(){
      System.out.println("Bike is running ");
      
    }  
}

class Bicycle extends Vehicle{
	void run(){
	   System.out.println("Bicycle is running");
        }
}

class Main {
  public static void main(String args[]){  
  Bicycle bicycle  = new Bicycle();  
  bicycle.run();
  Bike bike  = new Bike();  
  bike.run();
  }
}