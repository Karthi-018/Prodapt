class Mainclass{
	public static void main(String []args){
		Employe e=new Employe(12,"Jerish");
		System.out.println(e.getEid());
		System.out.println(e.getEname());
		e.setEid(80329);
		e.setEname("Jerish Johnson");
		
		System.out.println(e.getEid());
		System.out.println(e.getEname());

	}     
}
