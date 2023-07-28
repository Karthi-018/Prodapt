class Demo{
	final void display()
	{
		System.out.println("Final Method");
	}
}
class Test extends Demo{
	
	void display(String name){
		System.out.println("Test class Method");
	}
}
//o/p: Final Method



/*class Test extends Demo{
	@Override
	void display(String name){
		System.out.println("Test class Method");
	}
}MainFinal.java:8: error: method does not override or implement a method from a supertype
        @Override*/
/*class Test extends Demo{
	void display(String name){
		
		System.out.println("Test class Method");
	}
}
output:
Test class Method

class Test extends Demo{
	void display(){
		System.out.println("Test class Method");
	}
}
MainFinal.java:8: error: display() in Test cannot override display() in Demo
        void display(){
             ^
  overridden method is final
1 error*/
	
public class MainFinal{
	public static void main(String[] args){
		Test t=new Test();
		t.display();
	}
}