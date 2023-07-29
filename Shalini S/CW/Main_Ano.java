import java.util.*;

abstract class TestCar {

   abstract void testCarDetails();

}
class Main_Ano{
    public static void main(String args[]){
        TestCar tc = new TestCar();{
            @Override
            void testCarDetails();
            {
                System.out.println("Anonymous Super Car ");
            }
        }
        tc.testCarDetails();

    }
}