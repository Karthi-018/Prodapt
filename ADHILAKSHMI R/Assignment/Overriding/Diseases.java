class NaturalMedicine{ 
	public void dis(){
	System.out.println("Take the Medicine:");
}
}
class cold extends NaturalMedicine
{
	public void dis(){
	System.out.println("\nEchinacea is used to prevent Cold");
}
}
class immunity extends NaturalMedicine
{
	public void dis(){
	System.out.println("\nGinseng is used to enhance the Immunity");
}
}
class depression extends NaturalMedicine
{
	public void dis(){
	System.out.println("\nJohnword is used to prevent Depression");
}
}
class nausea extends NaturalMedicine
{
	public void dis(){
	System.out.println("\nGinger is used for relieving from Nausea");
}
}
public class Diseases{
public static void main(String args[]){
NaturalMedicine n=new NaturalMedicine();
n.dis();
cold c=new cold();
c.dis();
immunity i=new immunity();
i.dis();
depression d= new depression();
d.dis();
nausea na=new nausea();
na.dis();
}
}