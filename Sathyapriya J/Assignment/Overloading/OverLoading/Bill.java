class Bill
{
	public void fun(String n1,int n2,int n3)
	{
		System.out.println("Product: "+n1+" "+n2+"kg"+" Price : "+"Rs."+n3);
	}
	public void fun(String n1 ,int n2,int n3,String n4,int n5,int n6)
	{
		System.out.println("Product: "+n1+" "+n2+"kg"+" Price : "+n3+" Product: "+n4+" "+n5+"kg"+" Price : "+n6+" Total : "+"Rs."+(n3+n6));
	}
	public void fun(String n1,double n2,double n3)
	{
		System.out.println("Product: "+n1+" "+n2+"kg"+" Price : "+"Rs."+n3);
	}
	public void fun(String n1 ,double n2,double n3,String n4,double n5,double n6)
	{
		System.out.println("Product: "+n1+" "+n2+"kg"+" Price : "+n3+" Product: "+n4+" "+n5+"kg"+" Price : "+n6+" Total : "+"Rs."+(n3+n6));
	}
	public void fun()
	{
		System.out.println("No Item Found");
	}
}