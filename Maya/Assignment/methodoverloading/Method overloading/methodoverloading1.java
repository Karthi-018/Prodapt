public class methodoverloading1 {
   public int add(int a, int b) {
	return a + b;
  }
  
   public float add(float a, float b) {
	return a + b;
  }
  
  public static void main(String[] args) {
    methodoverloading1 m=new methodoverloading1();
    System.out.println(m.add(8, 5));
    System.out.println(m.add(4.3f, 6.2f));
  }
}