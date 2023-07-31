import java.util.Random;
public class df{
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
		
		boolean as=true;
		while(as){
			as=false;
			for(int i=0;i<numbers.length-1;i++){
			
				if(numbers[i]>numbers[i+1]){
					as=true;
					int temp=numbers[i];
					numbers[i]=numbers[i+1];
					numbers[i+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));

		for(int i=0;i<numbers.length;i++){
			System.out.println(numbers[i]);
		}

	}
}