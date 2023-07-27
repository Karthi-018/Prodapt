import java.util.Scanner; 
class Greatest 
{ 
  public static void main(String[] arg) 
  {  
    System.out.println("Please Enter Numbers: ");
    Scanner s = new Scanner(System.in); 
    int G = 0; 
    for(int i=0; i<5; i++) 
    { 
	int n = s.nextInt(); 
	  if(n > G) 
	  G = n; 
    }
    System.out.println("---------------");
    System.out.println("Greatest Number Is:" + G); 
  }
}