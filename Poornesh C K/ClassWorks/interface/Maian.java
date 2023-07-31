import java.util.Scanner;
public class Maian{
	public static void main(String []  args){
		Shapesarea er= new SquareI();
		Scanner sc =new Scanner(System.in);
		System.out.print("enter the length- ");
		int a=sc.nextInt();
		System.out.print("enter the Breadth- ");
		int b=sc.nextInt();
		er.area(a,b);

	}
}