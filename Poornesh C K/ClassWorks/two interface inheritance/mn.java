class mn implements demoInterface,demoInterface2{
	public void display(){
		System.out.println("world");
	}
 	public static void main(String args[]){
		mn obj=new mn();
		obj.display();
	}
}