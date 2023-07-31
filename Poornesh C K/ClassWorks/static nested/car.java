class car{
	String model="BMW A3";
	public String engine_no="wx123";
	static class Engine{
		void cardetailed(){
			car c =new car();
			System.out.println(c.model);
			System.out.println(c.engine_no);
		}
	}
	
}
