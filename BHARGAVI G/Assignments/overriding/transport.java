class tran{
	public void start(int l,int b){
	System.out.println(".............starting the transport..............");
	System.out.println(".............choose the transport you want..............");
}
}
class car extends tran{
	public void start(int l,int b){
	System.out.println("Starting the car...");
	System.out.println("Number of passengers can be travelled in car is 4");
	System.out.println("The total amount need to be paid for " +l+" hours is "+l*b);
}
}
class van extends tran{
	public void start(int l,int b){
	System.out.println("Starting the van...");
	System.out.println("Number of passengers can be travelled in van is 30");
	System.out.println("The total amount need to be paid for " +l+" hours is "+l*b);
}
}
public class transport
{
	public static void main(String args[])
{	
	tran t=new tran();
	t.start(2,100);
	car c=new car();
	c.start(3,450);
	van v=new van();
	v.start(1,600);
}
}