public class SpecialImplement 
{
    public static void main(String[] arg) 
    {
        SpecialImplement obj = new SpecialImplement();
        obj.dis("shifi");
    }
    
    public void dis(String obj)
    {
        System.out.println("String parameter");
    }
    
    public void dis(int obj)
    {
        System.out.println("Integer parameter");
    }
}