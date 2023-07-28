
class Cal{
	public static void main(String []args){
		Advancal c=new Advancal();
		System.out.println("The output is : "+ c.add(8,4));
	}
}

class Calc{
	public int add(int n1,int n2){
		return n1+n2;
	}
}
class Advancal extends Calc{
	public int add(int n1,int n2){
		return (n1+n2)*(n1-n2);
	}
}


