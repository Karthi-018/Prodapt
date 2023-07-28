import java.util.Scanner;
class GeoMn{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int b=sc.nextInt();
		Shapes s=new triangle();
		s.area(a,b);
		Shapes s=new rectangle();
	}
}