import java.util.*;
class fivenumber 
{
    public static void main(String args[]) 
    {   
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the numbers ");
        int a= s.nextInt();
	int b= s.nextInt();
	int c= s.nextInt();
	int d= s.nextInt();
	int e= s.nextInt();
	if(a>b && a>c && a>d && a>e)
	{
		System.out.println(a+ " a is greater" );
	}
	else if(b>a && b>c && b>d && b>e)
	{
		System.out.println(b+ "b is greater" );
	}
	else if(c>a && c>b && c>d && b>e)
	{
		System.out.println(c+ " is greater" );
	}
	else if(d>a && d>b && d>c && d>e)
	{
		System.out.println(d+ " is greater");
	}
	else
	{
		System.out.println(e+ " greater" );
	}
        
        
       
        
    }
}