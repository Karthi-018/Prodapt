package classFiles;
import java.util.Scanner;
public class greatestNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<5;i++){
			System.out.println("Enter number "+(i+1)+": ");
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int j=1;j<5;j++){
			if(arr[j]>max){
				max=arr[j];
			}
		}
		System.out.println("The greatest number is: "+max);
	}
}