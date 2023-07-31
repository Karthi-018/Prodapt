import java.util.Random;
public class selectionSort{
	public static void main(String args[]){
		Random r = new Random();
		int [] numbers=new int[10];
		for(int i=0; i<numbers.length;i++){
			numbers[i]=r.nextInt(10000000);
		}
for(int i=0;i<numbers.length;i++){
			System.out.println(numbers[i]);
		}
		System.out.println("-----------------");
		
		for(int i=0;i<numbers.length-1;i++){
			int min=i;
			for(int j=i+1; j<numbers.length;j++){
				if(numbers[min]>numbers[j]){
					min=j;
				}
			}
			int temp=numbers[i];
			numbers[i]=numbers[min];
			numbers[min]=temp;
		}

		for(int i=0;i<numbers.length;i++){
			System.out.println(numbers[i]);
		}

	}
}