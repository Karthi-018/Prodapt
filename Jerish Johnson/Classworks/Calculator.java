class Calculator{
	public void add(int... num){
		int sum=0;
		for (int n:num){
			sum=sum+n;
		}
		System.out.println("The sum of the number is : "+sum);
	}
	public static void main(String a[]){
		Calculator c= new Calculator();
		c.add(10,20);
		c.add(40,58,76,29);
		c.add(1,2,3,4,5,6,7,8,9,10);
	}
}