public class Printer{
public void print(String message)
{
	System.out.println(message);
}
public void print(int number)
{
	System.out.println("Number: "+number);
	
}
public  void print(double number)
{
	System.out.println("Number: " +number);
}
public static void main(String[] args){
Printer p=new Printer();
p.print("hello");
p.print(42);
p.print(3.14);
}
}