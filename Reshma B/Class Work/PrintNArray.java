import java.util.*;
class PrintNArray
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i;
		int j;
		int temp;
		int[] arr = new int[n];
		for(i=0;i<n;i++)
		{
			arr[i] = s.nextInt();
		}
		for (i=0;i<n-1;i++)
		{
			for (j=0;j<n-i-1;j++)
			{
				if (arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}

			}
		}		
		
		for(i=0;i<n;i++)
		{
			System.out.println(" ");
			System.out.println(arr[i]);
		}
		 
		
	}
}
