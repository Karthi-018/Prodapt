import java.util.Scanner;
class ekart{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("search the product");
		searchType p=new searchType();
		int productId= sc.nextInt();
		p.search(productId);
		String productName=sc.next();
		p.search(productName);
		

	}
}