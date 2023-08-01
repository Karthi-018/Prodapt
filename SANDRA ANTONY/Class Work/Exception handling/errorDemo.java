// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class errorDemo
{
    void myfun(int n1,int n2,int size,String str)  throws Exception //method type exception is throws
    {                                                         // throw keyword only throw one exception at a time
        int arr[]=new int [size];

        System.out.println(str.length());
        System.out.println(n1/n2);
        for(int i=0;i<size;i++)
        {
            arr[i]=i+1;
        }
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        errorDemo d= new errorDemo();
        try
        {
            d.myfun(10,0,5,"hiiiiii");

        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}