package org.example.nestedclasses;

public class Car {

    String model="xyz";
    private static String engineNumber="e-018";

    static class StaticEngine
    {
        void carDetails() {
            Car car = new Car();
            System.out.println("My Car Model is " + car.model);
            System.out.println("Car  StaticEngine number is " + engineNumber);
        }
    }

    class InstanceEngine {
        void carDetails() {
            System.out.println("My Car Model is " + model);
            System.out.println("Car InstanceEngine number is " + engineNumber);
        }
    }

    void myCarDetails() {
        class LocalEngine {
            void carDetails() {
                System.out.println("My Car Model is " + model);
                System.out.println("Car LocalEngine number is " + engineNumber);
            }
        }
        LocalEngine localEngine = new LocalEngine();
        localEngine.carDetails();
    }



}
