class Parent 
{
  	int x=10;
  	public void display()
    {
  		System.out.println("Parent x:"+x);
  	}
  }
  class Child extends Parent
  {
  	private int x=5;
  	public void display()
    {
  		System.out.println("Child x:"+x);
  	}
  }
  public class FieldShadowing
  { 
    public static void main(String args[]){
    Parent obj=new Child();
    obj.display();
  }
}
	