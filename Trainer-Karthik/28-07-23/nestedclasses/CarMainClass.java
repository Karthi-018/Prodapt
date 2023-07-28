package org.example.nestedclasses;

public class CarMainClass {

    public static void main(String[] args) {

        Car c = new Car();

        Car.InstanceEngine ie = c.new InstanceEngine();
        ie.carDetails();

        c.myCarDetails();



        TestCar tc = new TestCar(){
            @Override
            void testCarDetails()
            {
                System.out.println("Anonymous Super Car ");
            }
        };
        TestCar tc1 = new TestCar(){
            @Override
            void testCarDetails()
            {
                System.out.println("Super Car ");
            }
        };

        tc.testCarDetails();


        Car.StaticEngine se = new Car.StaticEngine();
        se.carDetails();

    }
}
