class Methodoverloading_2{
	void Area(int a,int b){
		System.out.println("The area of the rectangle  is : "+(a*b));
	}
	void Area(float a){
		System.out.println("the area of the circle is : "+(3.414*a*a));
	}
	
	void Area(int a,int b,int c){
		System.out.println("the area of the trapezoid is : "+(((a+b)/2)*c));
	}
	
	public static void main(String []args ){
		Methodoverloading_2 md=new Methodoverloading_2();
		
		md.Area(4,7);
		md.Area(8);
		md.Area(2,8,4);
	}
}