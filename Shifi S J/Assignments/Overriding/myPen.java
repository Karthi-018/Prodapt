class Pen {
   public void write() {
      System.out.println("It's a black pen");
   }
}
class Purse extends Pen {
   public void write() {
      System.out.println("That is my purse. Pen is inside it");
   }
}
public class myPen {
   public static void main(String args[]) {
      Pen a = new Pen(); 
      Pen b = new Purse(); 
      a.write(); 
      b.write();
   }
}