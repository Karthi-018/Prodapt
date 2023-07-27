class Mnclass{
	public static void main(String [] a){
		System.out.println("-------------------------");
		
		Director  d;
		d= new Director(80329,"jerish",28350,"ECE",983748957);
		
		System.out.println(d.getId());
		System.out.println(d.getName());
		System.out.println(d.getSal());
		System.out.println(d.getDept());
		System.out.println(d.getBud());
		
		
		
		
		/*Employee e;
		
		e = new Manager("Electronics");
		//e.Manger("Electronics");
		
		System.out.println(e.getDept);
		
		e.setId(80329);
		e.setName("Jerish");
		
		System.out.println(e.getId());
		System.out.println(e.getName());*/
	}
}