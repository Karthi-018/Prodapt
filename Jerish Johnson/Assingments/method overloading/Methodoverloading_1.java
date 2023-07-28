class Methodoverloading_1{
	
	
	void calculate(int a,int b){
		System.out.println("The calculated value is : "+(a+b));
	}
	void calculate(double a,double b){
		System.out.println("The Calculated value is : " + (a+b));
	}
	
	void calculate(int a,int b,int c ){
		System.out.println("The calculated value is  : "+ (a+b+c));
	}
	
	public static void main(String []args){
		Methodoverloading_1 mo = new Methodoverloading_1();
		mo.calculate(10,20);
		mo.calculate(45.30,95.25);
		mo.calculate(82,28,58);
	}
}