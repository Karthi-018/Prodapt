import java.util.*;

import java.util.*;

public class CalculatorExcep
{
    public static void main(String args[])
    {
        int n1=10,n2=0;
        int result=0;
        int arr[]=new int[5];

        try
        {
            result=n1/n2;
            arr[5]=10;

        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println(result);
    }
}

