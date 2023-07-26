public class StringConcatenation {
    public static void main(String[] args)
    {
        StringConcat sc= new StringConcat();
        System.out.println(sc.Concat("Hello","Programmer"));
        System.out.println(sc.Concat("Welcome"," to the"," new World"));

    }
}
class StringConcat
{
    public String Concat(String s1,String s2)
    {
        return s1+s2;
    }
    public String Concat(String s1,String s2,String s3)
    {
        return s1+s2+s3;
    }
}
