class Hospital
{
	void Patient(String name)
       {
		System.out.println("Enter name="+name);
	}

	void Patient(String name,String add)
       {
		System.out.println("Enter name="+name+" "+"Enter address="+add);
	}
	
    public static void main(String a[])
      {
	Hospital h=new Hospital();
	h.Patient("Ashi");
	h.Patient("Ash","Chennai");
       }
}
