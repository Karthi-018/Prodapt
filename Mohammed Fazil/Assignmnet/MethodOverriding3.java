class Fruit{  
    
  void eat(){
      System.out.println("Eating Fruit");
    }  
}  
 
class Apple extends Fruit{  
    
  void eat(){
      System.out.println("Eating Apple ");
      
    }  
}

class Mango extends Fruit{
	void eat(){
	   System.out.println("Eating Mango");
        }
}

class Main {
  public static void main(String args[]){  
  Apple apple  = new Apple();  
  apple.eat();
  Mango mango  = new Mango();  
  mango.eat();
  }
}