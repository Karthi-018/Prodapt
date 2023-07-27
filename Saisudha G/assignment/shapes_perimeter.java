//Method overloading (no.of parameters)

class shapes_perimeter{
	public int shape(int a){
		return (4*a);
	}
	public float shape(int a,int b){
		return (2*(a+b));
	}
	public float shape(int a,int b,int c){
		return(a+b+c);
	}
	public static void main(String args[]){
		shapes_perimeter sp=new shapes_perimeter();
		System.out.println(sp.shape(5));
		System.out.println(sp.shape(4,5));
		System.out.println(sp.shape(2,7,4));
	}}