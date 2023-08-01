class Mnclass implements DemoClass1 ,DemoClass2{
	public void display(){
		System.out.println("void Display");
	}
	public static void main(String []a){
		Mnclass o= new Mnclass();
		o.display();
		
	}
}