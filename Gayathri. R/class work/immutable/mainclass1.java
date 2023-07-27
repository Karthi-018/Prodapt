class mainclass1
{
	public static void main(String a[])
	{
		
		immutabledemo e=new immutabledemo(101,"abc");
		e.setEid(102);
		e.setEname("def");
		
		System.out.println(e.getEid());
		System.out.println(e.getEname());
}
}