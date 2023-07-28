class Program
{
String lang = "Java";
private static String level = "3 Rating";

static class Coding
{
void getReview()
{
Program p = new Program();
System.out.println(p.lang);
System.out.println(level);
}
}
}
public class MainClass
{
public static void main(String[] args)
{
	
Program.Coding c = new Program.Coding();
c.getReview();
}
}