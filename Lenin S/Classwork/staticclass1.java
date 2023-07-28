class Laptop

{

static int sdd=30; 
 
static class Software

{  

void spec()

{

System.out.println("sdd is "+sdd);

}  

}  

public static void main(String args[])

{  

Laptop.Software obj = new Laptop.Software();  

obj.spec(); 
 
}
  
}  