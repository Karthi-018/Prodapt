// ---- to print character one by one ----
public class ThreadMain2
{
    public static void main(String[] args) throws Exception{
        String str = "Hiiii I am Varrrrr!!";
        for(char c : str.toCharArray())
        {
            System.out.print(c);
            try
            {
                Thread.sleep(300);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
