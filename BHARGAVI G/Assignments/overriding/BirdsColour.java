class birds{ 
	public void colour(){
	System.out.println("Birds have different colours:");
	System.out.println("-----------------------------!");
}
}
class crow extends birds
{
	public void colour(){
	System.out.println("colour of crow is: black!");
	System.out.println("---------------------------");
}
}
class peacock extends birds
{
	public void colour(){
	System.out.println("colour of peacock is:blue and green!");
	System.out.println("------------------------------");
}
}
public class BirdsColour{
public static void main(String args[]){
birds b= new birds();
b.colour();
crow c=new crow();
c.colour();
peacock p = new peacock();
p.colour();
}
}

	
