interface IntefaceExample {

	final int a = 10;

	void display();
}

class TestClass implements In1 {


	public void display(){
	System.out.println("Shifi");
	}

	public static void main(String[] args)
	{
		TestClass t = new TestClass();
		t.display();
		System.out.println(a);
	}
}




