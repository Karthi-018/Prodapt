class Train
{  
void daytoday()
{
System.out.println("Train daytoday");
}  
}  
 
class Sleeper extends Train
{  
void daytoday()
{
System.out.println("sleeper's journey");      
}  
}

class Main
{
  public static void main(String args[])
{  
  Sleeper sleeper = new Sleeper();  
  sleeper.daytoday();
}
}