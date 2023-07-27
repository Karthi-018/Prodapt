public class Vehicle {
    public static void main(String[] args) {
        Vehicle obj=new Vehicle();
        obj.Cars("hyundai");
        obj.Cars("hyundai",2000000);
    }
    void Cars(String name){
        System.out.println("Name of the car : "+name);

    }
    void Cars(String name,int prize){
        System.out.println("Name of the car : "+name+" and the prize : "+prize);
    }
}
