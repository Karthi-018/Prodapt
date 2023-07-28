class Methodoverloading_3 {
	void ticketbook(String name1){
		System.out.println("Hi "+name1+ " your ticket is booked");
	}
	void ticketbook(String name1,String name2){
		System.out.println("Hi "+name1+"and "+name2+ ".Your   tickets were booked");
	}
	void ticketbook(String name1,String name2,String name3){
		System.out.println("Hi "+name1+" and "+name2 +name3+".All three tickets were booked");
	 }
	
	public static void main(String[]args){
		Methodoverloading_3 md= new Methodoverloading_3();
		
		md.ticketbook("Jerish");
		md.ticketbook("Jerish","John");
		md.ticketbook("poornesh","Jeeva","jerish");
	}
}