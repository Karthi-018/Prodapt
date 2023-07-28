public class Flower {
     void give(String flowers) {
System.out.println("Flower is " +flowers);
    }
 
     void give( int countOfFlowers)
 {
System.out.println("Number of Flowers is " +countOfFlowers);

 }
 
public static void main(String[] args){

Flower myflower = new Flower();
 
myflower.give("RoseMary"); 
myflower.give(45);


}
}