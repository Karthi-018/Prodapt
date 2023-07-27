import java.util.*;
public class BubbleSort
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int n=6;
		Scanner sc= new Scanner(System.in);
		int a[]=new int[n];
		int i,j,k,temp;
		for(i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
		    for(j=0;j<n-1-i;j++)
		    {
		        if(a[j]>a[j+1])
		        {
		            temp=a[j];
		            a[j]=a[j+1];
		            a[j+1]=temp;
		        }
		    }
		}
		for(i=0;i<n;i++)
		{
		    System.out.println(a[i]);
		    //a[i]=sc.nextInt();
		}
	}
}
