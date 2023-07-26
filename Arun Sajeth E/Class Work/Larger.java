import java.util.*;

class Larger
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp;

		ArrayList<Integer> arr=new ArrayList<Integer>(n);
		
		for(int i=0;i<n;i++)
		{	
			temp=s.nextInt();
			arr.add(temp);
		}
		
		System.out.println("Greater number is :"+Collections.max(arr));
	
	}

}