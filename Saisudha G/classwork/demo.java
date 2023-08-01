interface DemoInterface1{
	default void display(){
		System.out.println("hi");
		}}

interface DemoInterface2{
	default void display(){
		System.out.println("hello");
		}}

class demo implements DemoInterface1,DemoInterface2{
	public void display(){
		System.out.println("java");
		}
	public static void main(String args[]){
		demo d=new demo();
		d.display();
	}}