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
class Main {
  public static void main(String args[]){  
  Bike bike = new Bike();  
  bike.run();
  }
}