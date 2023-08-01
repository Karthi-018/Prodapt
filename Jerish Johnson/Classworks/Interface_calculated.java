interface  calculated{
	static void add(int n1,int n2){
		System.out.println("The sum is : "+(n1+n2));
		mul(n1,n2);
		div(n1,n2);
	}
	public static void sub(int n1,int n2){
		System.out.println("the dif is : "+ (n1-n2));
		mul(n1,n2);
		div(n1,n2);
	}
	public static void mul(int n1,int n2){
		System.out.println("the mul is "+(n1*n2));
	}
	public static void div(int n1,int n2){
		System.out.println("the div is :"+(n1/n2));
	}
}

class Interface_calculated implements calculated{
	public static void main(String []a){
		interface_calculated i = new interface_calculated();
		calculated.add(20,10);
		calculated.sub(30,10);
	}
}