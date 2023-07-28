import java.util.Scanner;
class entrance{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("scan");
		entrydata e= new entrydata();
		int id= sc.nextInt();
		e.entry(id);
		String name = sc.next();
		e.entry(id);
		e.entry(id,name);
		
	}		

}