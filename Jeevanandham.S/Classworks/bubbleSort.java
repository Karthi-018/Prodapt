package classFiles;
import java.util.Arrays;
import java.util.Scanner;
public class bubbleSort{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<size-1;j++){
			for(int x=0;x<size-1;x++){
				if(arr[x]>arr[x+1]){
					int temp = arr[x];
					arr[x]=arr[x+1];
					arr[x+1]=temp;
				}
				
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}
}