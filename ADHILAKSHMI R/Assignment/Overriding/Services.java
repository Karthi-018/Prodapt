class FrstGen{ 
	public void gen(){
	System.out.println("Mobile Telephoney(voice)");
}
}
class SecGen extends FrstGen
{
	public void gen(){
	System.out.println("\nDigital voice,SMS");
}
}
class ThrdGen extends FrstGen
{
	public void gen(){
	System.out.println("\nHigh quality video and audio");
}
}
class FourGen extends FrstGen
{
	public void gen(){
	System.out.println("\nWearable Devices");
}
}
class FiveGen extends FrstGen
{
	public void gen(){
	System.out.println("\nWearable Devices with AI Capabilities");
}
}
public class Services{
public static void main(String args[]){
FrstGen f= new FrstGen();
f.gen();
SecGen s=new SecGen();
s.gen();
ThrdGen t= new ThrdGen();
t.gen();
FourGen fo=new FourGen();
fo.gen();
FiveGen fi=new FiveGen();
fi.gen();
}
}

	