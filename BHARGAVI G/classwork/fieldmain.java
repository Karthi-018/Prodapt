class Fieldshadowing
{
     String str="demo";
}
class Test extends Fieldshadowing
{
      private String str="test";
}
public class fieldmain
{
	public static void main(String args[])
	{
	    Fieldshadowing d=new Test();
	    System.out.println(d.str);
		
		
	}
}