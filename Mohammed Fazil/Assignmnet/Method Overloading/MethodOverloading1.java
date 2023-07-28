class Car {
    void drive(int speed) {
        System.out.println("The speed is " + speed);
    }
    void drive(int speed ,String direction) {
        System.out.println("The speed "+" "+ speed + " "+"and direction "+" " +direction);
    }
}
class Main{
    public static void main(String[] args){
       Car myCar = new Car();
       myCar.drive(50); 
       myCar.drive(65 ,"north"); 
    }
}
